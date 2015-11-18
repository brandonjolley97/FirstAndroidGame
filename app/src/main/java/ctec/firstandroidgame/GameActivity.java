package ctec.firstandroidgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;


public class GameActivity extends AppCompatActivity
{
    private Button clearButton;
    private Button oButton;
    private Button xButton;
    private Button topLeftButton;
    private Button topMiddleButton;
    private Button topRightButton;
    private Button middleLeftButton;
    private Button middleButton;
    private Button middleRightButton;
    private Button bottomLeftButton;
    private Button bottomMiddleButton;
    private Button bottomRightButton;
    private TextView gameTitleView;
    int ticTacValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        clearButton = (Button) findViewById(R.id.clearButton);
        oButton = (Button) findViewById(R.id.oButton);
        xButton = (Button) findViewById(R.id.xButton);
        topLeftButton = (Button) findViewById(R.id.topLeftButton);
        topMiddleButton = (Button) findViewById(R.id.topMiddleButton);
        topRightButton = (Button) findViewById(R.id.topRightButton);
        middleLeftButton = (Button) findViewById(R.id.middleLeftButton);
        middleButton = (Button) findViewById(R.id.middleButton);
        middleRightButton = (Button) findViewById(R.id.middleRightButton);
        bottomLeftButton = (Button) findViewById(R.id.bottomLeftButton);
        bottomMiddleButton = (Button) findViewById(R.id.bottomMiddleButton);
        bottomRightButton = (Button) findViewById(R.id.bottomRightButton);
        gameTitleView = (TextView) findViewById(R.id.gameTitleView);

        setupListeners();
    }

    private void setupListeners()
    {

        topLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topLeftButton.setText("X");
                }
            }

        });

        topMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topMiddleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topMiddleButton.setText("X");
                }
            }

        });

        topRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topRightButton.setText("X");
                }
            }

        });

        middleLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleLeftButton.setText("X");
                }
            }

        });

        middleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleButton.setText("X");
                }
            }

        });

        middleRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleRightButton.setText("X");
                }
            }

        });

        bottomLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomLeftButton.setText("X");
                }
            }

        });

        bottomMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomMiddleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomMiddleButton.setText("X");
                }
            }

        });

        bottomRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomRightButton.setText("X");
                }
            }

        });

        oButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                ticTacValue = 1;
            }

        });

        xButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                ticTacValue = 2;
            }

        });

        clearButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                bottomRightButton.setText("-");
                bottomLeftButton.setText("-");
                bottomMiddleButton.setText("-");
                topRightButton.setText("-");
                topLeftButton.setText("-");
                topMiddleButton.setText("-");
                middleRightButton.setText("-");
                middleLeftButton.setText("-");
                middleButton.setText("-");

            }

        });






    }

}
