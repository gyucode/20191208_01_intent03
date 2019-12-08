package kr.co.tjoeun.a20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ninck_name.*

class ninck_name : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninck_name)


        cancleBtn.setOnClickListener {
            finish()
        }

//        확인버튼을 누루ㅡ면? 입력된 값을 받아서 main Activity로 돌려줘야함
        okBtn.setOnClickListener {
            //            입력된 값을 임시저장
            val nickName = nickNameEdt.text.toString()
//            결과를 담아주기 위한 용도의 인텐트 생성 출발지/목적지 없다
            val resultIntent = Intent()
            resultIntent.putExtra("nickName",nickName )

//            확인버튼을 눌럿다는 것을 명시+ 결과도 첨부
            setResult(Activity.RESULT_OK, resultIntent)

//            세팅이 끝났으니 화면 종료
            finish()
        }




    }
}
