import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*By Jorge Ramirez Carrasco 80545737
*Last edited 2/5/2017
*basis for the layout taken from Oracle "How to Use GridLayout" The Java™ Tutorials
*/
/**
 *@author Jorge Ramirez
 *@version 0.2
 *@since 2/12/2017
 */

public class TicTac extends JFrame
{
    /**This are default variables for the class that are used for making the layout and keep track
     *of the tictactoe
     */

    GridLayout experimentLayout = new GridLayout(3,3);
    public static int tictac [][]=new int [3][3];
    public static boolean Turn = false;

    /**Main method for initialising the swing GUI
     *
     */

    public static void main(String[] args)
    {

        Settictac();
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });

    }
//-----------------------------------------------------------------------------------------------------------------------------
    /**Method for initialising the array that will keep track of the tictactoe
     *
     */
    public static void Settictac()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tictac[i][j]=0;
            }
        }
    }
    /**Method for checking if any of the players won the game
     *@return wheter there a winner in the game
     */
    public static boolean WinCheck()
    {
        int Sum =0;
        for(int i=0;i<3;i++)
        {
            Sum = 0;
            Sum = tictac[i][0]+tictac[i][1]+tictac[i][2];

            if((Sum == 3 || Sum == -3))
                return true;
        }
        Sum =0;
        for(int i=0;i<3;i++)
        {
            Sum = 0;
            Sum = tictac[0][i]+tictac[1][i]+tictac[2][i];
            if((Sum == 3 || Sum == -3))
                return true;
        }
        Sum = 0;
        Sum = tictac[0][0]+tictac[1][1]+tictac[2][2];
        if((Sum == 3 || Sum == -3))
            return true;
        Sum = 0;
        Sum = tictac[0][2]+tictac[1][1]+tictac[2][0];
        return (Sum == 3 || Sum == -3);

    }

//-----------------------------------------------------------------------------------------------------------------------------
    /** Method made so the GUI wont resize itself
     *
     */
    public TicTac(String name)
    {
        super(name);
        setResizable(false);
    }
    /**The main method for setting all the GUI layout and the events of the conponetns with its Listeners
     *@return null
     */
    public void addComponentsToPane(final Container pane)
    {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,3));
        //Set up components preferred size
        JButton b = new JButton("Just fake button");
        Dimension buttonSize = b.getPreferredSize();
        compsToExperiment.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+20,(int)(buttonSize.getHeight() * 10)+20 * 2));
        //Add buttons to experiment with Grid Layout
/////////////////////////////////////////////////////////////////
        final JButton First = new JButton("");
        compsToExperiment.add(First);
        final JButton Second = new JButton("");
        compsToExperiment.add(Second);
        final JButton Third = new JButton("");
        compsToExperiment.add(Third);
        final JButton Fourth = new JButton("");
        compsToExperiment.add(Fourth);
        final JButton Fifth = new JButton("");
        compsToExperiment.add(Fifth);
        final JButton Sixth = new JButton("");
        compsToExperiment.add(Sixth);
        final JButton Seventh = new JButton("");
        compsToExperiment.add(Seventh);
        final JButton Eight = new JButton("");
        compsToExperiment.add(Eight);
        final JButton Ninth = new JButton("");
        compsToExperiment.add(Ninth);
////////////////////////////////////////////////////////////////

        First.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    First.setText("O");
                    Turn = false;
                    tictac [0][0] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText("");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    First.setText("X");
                    Turn= true;
                    tictac [0][0] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }

                }
                First.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Second.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Second.setText("O");
                    Turn = false;
                    tictac [0][1] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Second.setText("X");
                    Turn= true;
                    tictac [0][1] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Second.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Third.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Third.setText("O");
                    Turn = false;
                    tictac [0][2] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Third.setText("X");
                    Turn= true;
                    tictac [0][2] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Third.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Fourth.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Fourth.setText("O");
                    Turn = false;
                    tictac [1][0] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Fourth.setText("X");
                    Turn= true;
                    tictac [1][0] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Fourth.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Fifth.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Fifth.setText("O");
                    Turn = false;
                    tictac [1][1] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Fifth.setText("X");
                    Turn= true;
                    tictac [1][1] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Fifth.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Sixth.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Sixth.setText("O");
                    Turn = false;
                    tictac [1][2] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Sixth.setText("X");
                    Turn= true;
                    tictac [1][2] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Sixth.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Seventh.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Seventh.setText("O");
                    Turn = false;
                    tictac [2][0] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Seventh.setText("X");
                    Turn= true;
                    tictac [2][0] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText("");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Seventh.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Eight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Eight.setText("O");
                    Turn = false;
                    tictac [2][1] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Eight.setText("X");
                    Turn= true;
                    tictac [2][1] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Eight.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

        Ninth.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Turn)
                {
                    Ninth.setText("O");
                    Turn = false;
                    tictac [2][2] = 1;
                    if(WinCheck())
                    {
                        First.setText("---");
                        First.setEnabled(false);
                        Second.setText("---");
                        Second.setEnabled(false);
                        Third.setText("---");
                        Third.setEnabled(false);
                        Fourth.setText("|");
                        Fourth.setEnabled(false);
                        Fifth.setText(" ");
                        Fifth.setEnabled(false);
                        Sixth.setText("|");
                        Sixth.setEnabled(false);
                        Seventh.setText("---");
                        Seventh.setEnabled(false);
                        Eight.setText("---");
                        Eight.setEnabled(false);
                        Ninth.setText("---");
                        Ninth.setEnabled(false);
                    }
                }
                else
                {
                    Ninth.setText("X");
                    Turn= true;
                    tictac [2][2] = -1;
                    if(WinCheck())
                    {
                        First.setText("\\\\");
                        First.setEnabled(false);
                        Second.setText(" ");
                        Second.setEnabled(false);
                        Third.setText("///");
                        Third.setEnabled(false);
                        Fourth.setText(" ");
                        Fourth.setEnabled(false);
                        Fifth.setText("X");
                        Fifth.setEnabled(false);
                        Sixth.setText(" ");
                        Sixth.setEnabled(false);
                        Seventh.setText("///");
                        Seventh.setEnabled(false);
                        Eight.setText(" ");
                        Eight.setEnabled(false);
                        Ninth.setText("\\\\");
                        Ninth.setEnabled(false);
                    }
                }
                Ninth.setEnabled(false);
            }
        });

//////////////////////////////////////////////////////////////

        pane.add(compsToExperiment, BorderLayout.NORTH);
    }
    /** The method for initialising the GUI
     *
     */
    private static void createAndShowGUI() {

        TicTac frame = new TicTac("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }


}