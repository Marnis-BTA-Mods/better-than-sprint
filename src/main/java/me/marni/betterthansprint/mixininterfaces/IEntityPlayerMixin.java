package me.marni.betterthansprint.mixininterfaces;

public interface IEntityPlayerMixin
{
	float getStamina();
	void setStamina(float stamina);

	boolean isExhausted();
	void setExhausted(boolean exhausted);

	float getPrevStamina();
}
