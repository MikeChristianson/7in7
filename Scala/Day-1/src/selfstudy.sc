object selfstudy {
	def winner(board: List[Char]): Boolean = {
		if(board.size != 9) throw new IllegalArgumentException("board must be List.size == 9")
		accross(board) || down(board) || diagonal(board)
	}                                         //> winner: (board: List[Char])Boolean
	
	def accross(board: List[Char]): Boolean = {
		matching(board.slice(0,3)) ||
		matching(board.slice(3,6)) ||
		matching(board.slice(6,9))
	}                                         //> accross: (board: List[Char])Boolean

	def down(board: List[Char]): Boolean = {
		matching(List(board(0), board(3), board(6))) ||
		matching(List(board(1), board(4), board(7))) ||
		matching(List(board(2), board(5), board(8)))
	}                                         //> down: (board: List[Char])Boolean

	def diagonal(board: List[Char]): Boolean = {
		matching(List(board(0), board(4), board(8))) ||
		matching(List(board(2), board(4), board(6)))
	}                                         //> diagonal: (board: List[Char])Boolean
	
	def matching(seq: List[Char]): Boolean = {
		assert(seq.size == 3)
		val d = seq.distinct
		d.size == 1 && (d.head == 'X' || d.head == 'O')
	}                                         //> matching: (seq: List[Char])Boolean
	
	//winner(List())
  //winner(List('X'))
  winner(List('X','X','X',
              'O',' ','O',
              'X','O','O'))                       //> res0: Boolean = true
              
	winner(List(' ',' ',' ',
              ' ',' ',' ',
              ' ',' ',' '))                       //> res1: Boolean = false
              
	winner(List('X','O','X',
              'O','X','O',
              'X','O','O'))                       //> res2: Boolean = true
              

	winner(List('X','X','O',
              'O','X','O',
              'X','O','O'))                       //> res3: Boolean = true

	winner(List('X','X','O',
              'O','X','X',
              'X','O','O'))                       //> res4: Boolean = false
}