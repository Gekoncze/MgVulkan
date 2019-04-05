package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerReductionModeCreateInfoEXT extends VulkanObject {
    public VulkanSamplerReductionModeCreateInfoEXT(){
        super(new VkSamplerReductionModeCreateInfoEXT());
    }

    public VulkanSamplerReductionModeCreateInfoEXT(VkSamplerReductionModeCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkSamplerReductionModeCreateInfoEXT getVk(){
        return (VkSamplerReductionModeCreateInfoEXT) super.getVk();
    }
    public VulkanSamplerReductionModeCreateInfoEXT(VulkanObject pNext, VulkanSamplerReductionModeEXT reductionMode) {
        super(new VkSamplerReductionModeCreateInfoEXT(pNext.getVk(), reductionMode.getVk()));
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

    public VulkanSamplerReductionModeEXT getReductionMode() {
        return new VulkanSamplerReductionModeEXT(getVk().getReductionMode());
    }

    public void setReductionMode(VulkanSamplerReductionModeEXT reductionMode) {
        getVk().setReductionMode(reductionMode.getVk());
    }


    public static class Array extends VulkanSamplerReductionModeCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerReductionModeCreateInfoEXT> {
        public Array(VkSamplerReductionModeCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerReductionModeCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanSamplerReductionModeCreateInfoEXT o){
            this(new VkSamplerReductionModeCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerReductionModeCreateInfoEXT.Array getVk(){
            return (VkSamplerReductionModeCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerReductionModeCreateInfoEXT get(int i){
            return new VulkanSamplerReductionModeCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerReductionModeCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerReductionModeCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerReductionModeCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkSamplerReductionModeCreateInfoEXT.Pointer getVk(){
            return (VkSamplerReductionModeCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerReductionModeCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerReductionModeCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkSamplerReductionModeCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanSamplerReductionModeCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerReductionModeCreateInfoEXT.Pointer.Array getVk(){
                return (VkSamplerReductionModeCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerReductionModeCreateInfoEXT.Pointer get(int i){
                return new VulkanSamplerReductionModeCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
