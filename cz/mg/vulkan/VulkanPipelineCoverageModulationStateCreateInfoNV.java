package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html">khronos documentation</a>
 **/
public class VulkanPipelineCoverageModulationStateCreateInfoNV extends VulkanObject {
    public VulkanPipelineCoverageModulationStateCreateInfoNV(){
        super(new VkPipelineCoverageModulationStateCreateInfoNV());
    }

    public VulkanPipelineCoverageModulationStateCreateInfoNV(VkPipelineCoverageModulationStateCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageModulationStateCreateInfoNV getVk(){
        return (VkPipelineCoverageModulationStateCreateInfoNV) super.getVk();
    }
    public VulkanPipelineCoverageModulationStateCreateInfoNV(VulkanObject pNext, VulkanPipelineCoverageModulationStateCreateFlagsNV flags, VulkanCoverageModulationModeNV coverageModulationMode, VulkanBool32 coverageModulationTableEnable, VulkanUInt32 coverageModulationTableCount, VulkanFloat pCoverageModulationTable) {
        super(new VkPipelineCoverageModulationStateCreateInfoNV(pNext.getVk(), flags.getVk(), coverageModulationMode.getVk(), coverageModulationTableEnable.getVk(), coverageModulationTableCount.getVk(), pCoverageModulationTable.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanPipelineCoverageModulationStateCreateFlagsNV getFlags() {
        return new VulkanPipelineCoverageModulationStateCreateFlagsNV(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineCoverageModulationStateCreateFlagsNV flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanCoverageModulationModeNV getCoverageModulationMode() {
        return new VulkanCoverageModulationModeNV(getVk().getCoverageModulationMode());
    }

    public void setCoverageModulationMode(VulkanCoverageModulationModeNV coverageModulationMode) {
        getVk().setCoverageModulationMode(coverageModulationMode.getVk());
    }

    public VulkanBool32 getCoverageModulationTableEnable() {
        return new VulkanBool32(getVk().getCoverageModulationTableEnable());
    }

    public void setCoverageModulationTableEnable(VulkanBool32 coverageModulationTableEnable) {
        getVk().setCoverageModulationTableEnable(coverageModulationTableEnable.getVk());
    }

    public VulkanUInt32 getCoverageModulationTableCount() {
        return new VulkanUInt32(getVk().getCoverageModulationTableCount());
    }

    public void setCoverageModulationTableCount(VulkanUInt32 coverageModulationTableCount) {
        getVk().setCoverageModulationTableCount(coverageModulationTableCount.getVk());
    }

    public VulkanFloat getPCoverageModulationTable() {
        return new VulkanFloat(getVk().getPCoverageModulationTable());
    }

    public void setPCoverageModulationTable(VulkanFloat pCoverageModulationTable) {
        getVk().setPCoverageModulationTable(pCoverageModulationTable.getVk());
    }


    public static class Array extends VulkanPipelineCoverageModulationStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageModulationStateCreateInfoNV> {
        public Array(VkPipelineCoverageModulationStateCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCoverageModulationStateCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanPipelineCoverageModulationStateCreateInfoNV o){
            this(new VkPipelineCoverageModulationStateCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCoverageModulationStateCreateInfoNV.Array getVk(){
            return (VkPipelineCoverageModulationStateCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCoverageModulationStateCreateInfoNV get(int i){
            return new VulkanPipelineCoverageModulationStateCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCoverageModulationStateCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCoverageModulationStateCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCoverageModulationStateCreateInfoNV.Pointer(value));
        }

        @Override
        public VkPipelineCoverageModulationStateCreateInfoNV.Pointer getVk(){
            return (VkPipelineCoverageModulationStateCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCoverageModulationStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageModulationStateCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineCoverageModulationStateCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineCoverageModulationStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCoverageModulationStateCreateInfoNV.Pointer.Array getVk(){
                return (VkPipelineCoverageModulationStateCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCoverageModulationStateCreateInfoNV.Pointer get(int i){
                return new VulkanPipelineCoverageModulationStateCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
