<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<form action="reservation" method="post">

	<p>名前を入力してください。</p>
	<p>
		<input type="text" name="name" required>
	</p>

	<p>メールアドレスを入力してください。</p>
	<p>
		<input type="text" name="mail" required>
	</p>

	<p>宿泊日を入力してください。</p>
	<p>
		<input type="date" name="date" required>
	</p>

	<p>宿泊人数を選択してください。</p>
	<select name="count" required>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
	</select>

	<p>宿泊日数を選択してください。</p>
	<select name="days" required>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
	</select>

	<p>部屋タイプを選択してください。</p>
	<label>
		<input type="radio" name="room" value="シングル" checked>シングル
	</label>
	<label>
		<input type="radio" name="room" value="ダブル">ダブル
	</label>
	<label>
		<input type="radio" name="room" value="ツイン">ツイン
	</label>
	<label>
		<input type="radio" name="room" value="トリプル">トリプル
	</label>

	<p>オプション</p>
	<label>
		<p>
			<input type="checkbox" name="option" value="送迎付">送迎付
		</p>
	</label>
	<label>
	 	<p>
			<input type="checkbox" name="option" value="朝食付">朝食付
		</p>
	</label>
	<label>
	 	<p>
			<input type="checkbox" name="option" value="和室">和室
		</p>
	</label>
	<label>
	 	<p>
			<input type="checkbox" name="option"
			value="3歳以下の子供がいる">3歳以下の子供がいる
		</p>
	</label>

	<p>
		<input type="submit" value="予約">
	</p>

</form>



<%@include file="../footer.html"%>