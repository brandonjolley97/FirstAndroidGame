package ctec.firstandroidgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.View;


public class GameActivity extends AppCompatActivity
{
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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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

            }

        });

        topMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        topRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        middleLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        middleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        middleRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        bottomLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        bottomMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });

        bottomRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {

            }

        });





    }

}
