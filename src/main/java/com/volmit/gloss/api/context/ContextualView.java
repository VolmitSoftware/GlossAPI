package com.volmit.gloss.api.context;

import java.util.concurrent.ExecutorService;

import org.bukkit.entity.Player;

import com.volmit.gloss.api.board.Board;
import com.volmit.gloss.api.board.BoardContext;
import com.volmit.gloss.api.board.BoardMeta;

import mortar.lang.collection.GList;

public interface ContextualView
{
	public boolean isTimeChanging();

	public void setTimeChanging(boolean changing);

	public void setTimeSync(long time);

	public long getTimeSync();

	public DropContext getDropContext();

	public InventoryContext getInventoryContext();

	public BoardContext getBoardContext();

	public Player getPlayer();

	public Board getBoard();

	public void setBoardMeta(BoardMeta m);

	public BoardMeta getBoardMeta();

	public TabMeta getTabMeta();

	public void setTabMeta(TabMeta m);

	public boolean hasBoard();

	public StaticContext getStaticContext(String id);

	public Context getHandContext();

	public GList<StaticContext> getStaticContexts();

	public void addStaticContext(StaticContext stx);

	public void removeStaticContext(StaticContext stx);

	public void removeStaticContext(String id);

	public boolean hasStaticContext(String id);

	public void update(ExecutorService svc);

	public StaticContext getStaticContextLooking();

	public void destroy();

	public void justClicked();

	public void fastFowardTime(int i);
}
