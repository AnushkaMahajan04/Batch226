package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:9179/advjava226";
	String username="root";
	String password="Root12";

	public List<Player> getallplayers() {
		
		System.out.println("In IPLDao.getAllPlayers() method");
        List<Player> playerList = new ArrayList<>();

        String query = "SELECT * FROM player";
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(path);
            System.out.println(1);

            conn = DriverManager.getConnection(url, username, password);
            System.out.println(2);

            preparedStatement = conn.prepareStatement(query);
            System.out.println(3);

            resultSet = preparedStatement.executeQuery();
            System.out.println(4);

            while (resultSet.next()) {
                int pid = resultSet.getInt(1);
                int jn = resultSet.getInt(2);
                String pname = resultSet.getString(3);
                int runs = resultSet.getInt(4);
                int wicket = resultSet.getInt(5);
                String tname = resultSet.getString(6);

                Player p = new Player(pid, jn, pname, runs, wicket, tname);
                playerList.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return playerList;
    }

    // Insert Player
    public int insertPlayer(Player player) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(path);
            System.out.println(1);

            conn = DriverManager.getConnection(url, username, password);
            System.out.println(2);

            String insertQuery = "INSERT INTO player VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = conn.prepareStatement(insertQuery);
            System.out.println(3);

            preparedStatement.setInt(1, player.getPid());
            preparedStatement.setInt(2, player.getJno());
            preparedStatement.setString(3, player.getName());
            preparedStatement.setInt(4, player.getRuns());
            preparedStatement.setInt(5, player.getWickets());
            preparedStatement.setString(6, player.getTname());

            int ack = preparedStatement.executeUpdate();
            System.out.println(4);

            return ack;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    public int updatePlayer(int i,int j) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(path);
            System.out.println(1);

            conn = DriverManager.getConnection(url, username, password);
            System.out.println(2);

            String updateQuery = "UPDATE player SET  runs = ? WHERE pid = ?";
            preparedStatement = conn.prepareStatement(updateQuery);
            System.out.println(3);

            preparedStatement.setInt(1,i);
            preparedStatement.setInt(2,j);

            int ack = preparedStatement.executeUpdate();
            System.out.println(4);

            return ack;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

	public int deletePlayer(int d) {
		 int result = 0;

		   
		    String query = "DELETE FROM player WHERE pid = ?";

		    try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection conn = DriverManager.getConnection(url, username, password);
		        PreparedStatement pstmt = conn.prepareStatement(query);
		        pstmt.setInt(1, d);
		        result = pstmt.executeUpdate();

		        conn.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return result;}



}
