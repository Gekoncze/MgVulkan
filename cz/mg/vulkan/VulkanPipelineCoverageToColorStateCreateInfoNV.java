package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineCoverageToColorStateCreateInfoNV extends VulkanObject {
    public VulkanPipelineCoverageToColorStateCreateInfoNV(){
        super(new VkPipelineCoverageToColorStateCreateInfoNV());
    }

    public VulkanPipelineCoverageToColorStateCreateInfoNV(VkPipelineCoverageToColorStateCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageToColorStateCreateInfoNV getVk(){
        return (VkPipelineCoverageToColorStateCreateInfoNV) super.getVk();
    }
    public VulkanPipelineCoverageToColorStateCreateInfoNV(VulkanObject pNext, VulkanPipelineCoverageToColorStateCreateFlagsNV flags, VulkanBool32 coverageToColorEnable, VulkanUInt32 coverageToColorLocation) {
        super(new VkPipelineCoverageToColorStateCreateInfoNV(pNext.getVk(), flags.getVk(), coverageToColorEnable.getVk(), coverageToColorLocation.getVk()));
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

    public VulkanPipelineCoverageToColorStateCreateFlagsNV getFlags() {
        return new VulkanPipelineCoverageToColorStateCreateFlagsNV(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineCoverageToColorStateCreateFlagsNV flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBool32 getCoverageToColorEnable() {
        return new VulkanBool32(getVk().getCoverageToColorEnable());
    }

    public void setCoverageToColorEnable(VulkanBool32 coverageToColorEnable) {
        getVk().setCoverageToColorEnable(coverageToColorEnable.getVk());
    }

    public VulkanUInt32 getCoverageToColorLocation() {
        return new VulkanUInt32(getVk().getCoverageToColorLocation());
    }

    public void setCoverageToColorLocation(VulkanUInt32 coverageToColorLocation) {
        getVk().setCoverageToColorLocation(coverageToColorLocation.getVk());
    }


    public static class Array extends VulkanPipelineCoverageToColorStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageToColorStateCreateInfoNV> {
        public Array(VkPipelineCoverageToColorStateCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCoverageToColorStateCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanPipelineCoverageToColorStateCreateInfoNV o){
            this(new VkPipelineCoverageToColorStateCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCoverageToColorStateCreateInfoNV.Array getVk(){
            return (VkPipelineCoverageToColorStateCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCoverageToColorStateCreateInfoNV get(int i){
            return new VulkanPipelineCoverageToColorStateCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCoverageToColorStateCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCoverageToColorStateCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCoverageToColorStateCreateInfoNV.Pointer(value));
        }

        @Override
        public VkPipelineCoverageToColorStateCreateInfoNV.Pointer getVk(){
            return (VkPipelineCoverageToColorStateCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCoverageToColorStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageToColorStateCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineCoverageToColorStateCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineCoverageToColorStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCoverageToColorStateCreateInfoNV.Pointer.Array getVk(){
                return (VkPipelineCoverageToColorStateCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCoverageToColorStateCreateInfoNV.Pointer get(int i){
                return new VulkanPipelineCoverageToColorStateCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
