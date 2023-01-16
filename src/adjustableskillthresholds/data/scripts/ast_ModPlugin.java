package adjustableskillthresholds.data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.skills.SystemsExpertise;

public class ast_ModPlugin extends BaseModPlugin {

    private static final float SysExp_BonusCharges = Global.getSettings().getFloat("SystemsExpertiseBonusCharges");
    private static final float SysExp_ChargeRegenRate = Global.getSettings().getFloat("SystemsExpertiseRegenerationRatePercent");
    private static final float SysExp_BonusRange = Global.getSettings().getFloat("SystemsExpertiseSystemBonusRangePercent");
    private static final float SysExp_CooldownReductionPercent = Global.getSettings().getFloat("SystemsExpertiseCooldownReductionPercent");
    private static final float SysExp_PeakTimeBonus = Global.getSettings().getFloat("SystemsExpertisePeakTimeBonus");
    private static final float SysExp_OverloadReduction = Global.getSettings().getFloat("SystemsExpertiseOverloadReduction");


    public void onGameLoad(boolean newGame) {
        // Systems Expertise skill bonuses
        SystemsExpertise.BONUS_CHARGES = SysExp_BonusCharges;
        SystemsExpertise.REGEN_PERCENT = SysExp_ChargeRegenRate;
        SystemsExpertise.RANGE_PERCENT = SysExp_BonusRange;
        SystemsExpertise.SYSTEM_COOLDOWN_REDUCTION_PERCENT = SysExp_CooldownReductionPercent;
        SystemsExpertise.PEAK_TIME_BONUS = SysExp_PeakTimeBonus;
        SystemsExpertise.OVERLOAD_REDUCTION = SysExp_OverloadReduction;



    }
}
