#---
# Excerpted from "Seven Languages in Seven Weeks",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material, 
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose. 
# Visit http://www.pragmaticprogrammer.com/titles/btlang for more book information.
#---
class Tree
  attr_accessor :children, :node_name
  
  def initialize(hash)
    @node_name = hash.keys.first
    puts "node name is #{@node_name}"
    child_nodes = hash.fetch @node_name
    if !child_nodes.empty?
      puts "children is #{child_nodes} of #{child_nodes.class}"
      @children = Tree.new(child_nodes)
    end
  end
  
  def visit_all(&block)
    visit &block
    children.each {|key, value| value.visit_all &block}
  end
  
  def visit(&block)
    block.call self
  end
end

homework_tree = Tree.new({'grandpa' => { 'dad' => {'child 1' => {}, 'child 2' => {} }, 'uncle' => {'child 3' => {}, 'child 4' => {} } } })

puts "visiting homework tree"
homework_tree.visit_all {|node| puts node.node_name}