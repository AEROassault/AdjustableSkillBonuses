package adjustableskillbonuses.data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.skills.*;

public class asb_ModPlugin extends BaseModPlugin {

    private static final float FieldMod_ShieldDamageReduction = Global.getSettings().getFloat("FieldModShieldDamageReductionPercent");
    private static final float FieldMod_FluxShuntPercent = Global.getSettings().getFloat("FieldModHardFluxDissipationPercent");
    private static final float FieldMod_PhaseUpkeepPercent = Global.getSettings().getFloat("FieldModPhaseCloakUpkeepReductionPercent");
    private static final float FieldMod_PhaseCooldownPercent = Global.getSettings().getFloat("FieldModPhaseCloakCooldownPercent");

    private static final float PointDef_FighterDamage = Global.getSettings().getFloat("PointDefFighterDamagePercentBonus");
    private static final float PointDef_MissileDamage = Global.getSettings().getFloat("PointDefMissileDamagePercentBonus");
    private static final float PointDef_FlatRange = Global.getSettings().getFloat("PointDefFlatRangeBonus");

    private static final float BallisticMastery_Damage = Global.getSettings().getFloat("BallisticMasteryDamageBonus");
    private static final float BallisticMastery_Range = Global.getSettings().getFloat("BallisticMasteryRangeBonus");
    private static final float BallisticMastery_ProjSpeed = Global.getSettings().getFloat("BallisticMasteryProjectileSpeedBonus");

    private static final float SysExp_BonusCharges = Global.getSettings().getFloat("SystemsExpertiseBonusCharges");
    private static final float SysExp_ChargeRegenRate = Global.getSettings().getFloat("SystemsExpertiseRegenerationRatePercent");
    private static final float SysExp_BonusRange = Global.getSettings().getFloat("SystemsExpertiseSystemBonusRangePercent");
    private static final float SysExp_CDRPercent = Global.getSettings().getFloat("SystemsExpertiseCooldownReductionPercent");
    private static final float SysExp_PeakTimeBonus = Global.getSettings().getFloat("SystemsExpertisePeakTimeBonus");
    private static final float SysExp_OverloadReduction = Global.getSettings().getFloat("SystemsExpertiseOverloadReduction");
    private static final float SysExp_MalfunctionChance = Global.getSettings().getFloat("SystemsExpertiseMalfunctionChanceMult");

    private static final float MissileSpec_AmmoCap = Global.getSettings().getFloat("MissileSpecializationAmmoCapacityBonus");
    private static final float MissileSpec_MissileHP = Global.getSettings().getFloat("MissileSpecializationAmmoCapacityBonus");
    private static final float MissileSpec_ROF = Global.getSettings().getFloat("MissileSpecializationAmmoCapacityBonus");
    private static final float MissileSpec_Damage = Global.getSettings().getFloat("MissileSpecializationAmmoCapacityBonus");

    private static final float MakeshiftEquip_SupplyReductionMaxPercent = Global.getSettings().getFloat("MakeshiftEqiupmentSupplyReductionMaxPercent");
    private static final float MakeshiftEquip_SupplyReductionMaxUnits = Global.getSettings().getFloat("MakeshiftEqiupmentSupplyReductionMaxUnits");
    private static final float MakeshiftEquip_SurveyCostMult = Global.getSettings().getFloat("MakeshiftEqiupmentSurveyCostMult");


    public void onApplicationLoad() {
        // Damage Control


        // Field Modulation
        FieldModulation.SHIELD_DAMAGE_REDUCTION = FieldMod_ShieldDamageReduction;
        FieldModulation.FLUX_SHUNT_DISSIPATION = FieldMod_FluxShuntPercent;
        FieldModulation.PHASE_FLUX_UPKEEP_REDUCTION = FieldMod_PhaseUpkeepPercent;
        FieldModulation.PHASE_COOLDOWN_REDUCTION = FieldMod_PhaseCooldownPercent;

        // Point Defense
        PointDefense.FIGHTER_DAMAGE_BONUS = PointDef_FighterDamage;
        PointDefense.MISSILE_DAMAGE_BONUS = PointDef_MissileDamage;
        PointDefense.PD_RANGE_BONUS_FLAT = PointDef_FlatRange;

        // Target Analysis skill bonuses NOT WORKING, VARIABLES ARE FINAL

        // Ballistic Mastery
        BallisticMastery.DAMAGE_BONUS = BallisticMastery_Damage;
        BallisticMastery.RANGE_BONUS = BallisticMastery_Range;
        BallisticMastery.PROJ_SPEED_BONUS = BallisticMastery_ProjSpeed;

        // Systems Expertise skill bonuses
        SystemsExpertise.BONUS_CHARGES = SysExp_BonusCharges;
        SystemsExpertise.REGEN_PERCENT = SysExp_ChargeRegenRate;
        SystemsExpertise.RANGE_PERCENT = SysExp_BonusRange;
        SystemsExpertise.SYSTEM_COOLDOWN_REDUCTION_PERCENT = SysExp_CDRPercent;
        SystemsExpertise.PEAK_TIME_BONUS = SysExp_PeakTimeBonus;
        SystemsExpertise.OVERLOAD_REDUCTION = SysExp_OverloadReduction;
        SystemsExpertise.MALFUNCTION_CHANCE_MULT = SysExp_MalfunctionChance;

        // Missile Specialization skill bonuses NOT WORKING, VARIABLES ARE FINAL

        // Makeshift Equipment
        MakeshiftEquipment.SUPPLY_USE_REDUCTION_MAX_PERCENT = MakeshiftEquip_SupplyReductionMaxPercent;
        MakeshiftEquipment.SUPPLY_USE_REDUCTION_MAX_UNITS = MakeshiftEquip_SupplyReductionMaxUnits;
        MakeshiftEquipment.SURVEY_COST_MULT = MakeshiftEquip_SurveyCostMult;

    }
}
