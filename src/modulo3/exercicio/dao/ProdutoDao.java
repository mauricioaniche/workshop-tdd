package modulo3.exercicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

	private final Connection conn;

	public ProdutoDao(Connection conn) {
		this.conn = conn;
	}

	public void adiciona(Produto produto) {

		try {
			String sql = "insert into produto (nome, descricao, valor) values (?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Produto produto) {

		try {
			String sql = "update produto set nome=?, descricao=?, valor=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.setInt(4, produto.getId());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleta(Produto produto) {

		try {
			String sql = "delete from produto where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, produto.getId());

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> pegaTodos() {
		try {

			String sql = "select * from produto";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			List<Produto> todos = parseia(rs);

			return todos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Produto> precoEntre(double menor, double maior) {
		try {

			String sql = "select * from produto where preco between ? and ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setDouble(1, menor);
			ps.setDouble(2, maior);
			
			ResultSet rs = ps.executeQuery();
			List<Produto> todos = parseia(rs);

			return todos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private List<Produto> parseia(ResultSet rs) throws SQLException {
		List<Produto> todos = new ArrayList<Produto>();

		while (rs.next()) {
			todos.add(new Produto(rs.getInt("id"), rs.getString("nome"), rs
					.getString("descricao"), rs.getDouble("preco")));
		}
		return todos;
	}
}
