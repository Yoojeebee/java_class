package service;

import java.util.ArrayList;

import vo.User;

public class UserService extends Service {

	/**
	 * 모든 가입자 정보를 반환한다.
	 * @return User의 ArrayList 객체
	 */
	public ArrayList<User> getUsers() {
		return super.getRepository().getUserRepository().getAllUsers();
	}

	public UserService() {
		super();
	}

	/**
	 * 신규 사용자를 등록한다.<br/>
	 * 동일한 아이디를 가진 사용자가 있는 경우 등록되지 않는다.
	 * @param user 신규 사용자 정보
	 * @return 등록 성공여부
	 */
	public boolean insertNewUser(User user) {
		boolean isSuccess = false;
		
		/* 1. 저장소에 동일한 아이디를 가진 사용자가 있는지 체크한다.
		 * 			- 사용자가 입력한 아이디를 user에서 가져온다
		 * 			- UserRepository의 getUserById(String)를 실행해서 User정보를 가져온다
		 * 			- 조회된 User 객체가 null이 아니면 사용자가 존재함
		 * 			- 조회된 User 객체가 null이면 사용자가 존재하지 않음
		 * 2. 사용자가 존재하면 않으면
		 * 			- UserRepository의 insertUser(User)를 실행한다.
		 * 			- isSuccess에 true값을 저장한다.
		 */
		
		// 매개변수로 전달받은 User 객체에서 id를 조회한다.
		String userId = user.getId();
		// id에 해당하는 사용자정보를 저장소에서 조회한다.
		User savedUser = super.getRepository().getUserRepository().getUserById(userId);
		// 저장된 사용자정보가 없으면 
		if(savedUser == null) {
			// 저장소에 전달받은 사용자정보를 저장한다.
			super.getRepository().getUserRepository().insertUser(user);
			// 성공여부를 true로 전달한다.
			isSuccess = true;
		}
		
		return isSuccess;
	}
	
	/**
	 * 지정된 사용자아이디에 해당하는 사용자의 정보를 삭제한다.<br/>
	 * 사용자 정보, 사용자의 주문내역 등이 모두 삭제된다.
	 * @param userId 삭제할 사용자 아이디
	 * @return 삭제할 사용자정보가 존재하지 않으면 false를 반환한다.
	 */
	public boolean deleteUser(String userId) {
		User savedUser = super.getRepository().getUserRepository().getUserById(userId);
		if(savedUser == null) {
			return false;
		}
		// 사용자 정보 삭제
		super.getRepository().getUserRepository().removeUser(userId);
		// 사용자의 주문내역 정보 삭제
		return true;
	}

}
