package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSamplerYcbcrConversionFeatures.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceSamplerYcbcrConversionFeatures extends VulkanObject {
    public VulkanPhysicalDeviceSamplerYcbcrConversionFeatures(){
        super(new VkPhysicalDeviceSamplerYcbcrConversionFeatures());
    }

    public VulkanPhysicalDeviceSamplerYcbcrConversionFeatures(VkPhysicalDeviceSamplerYcbcrConversionFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures getVk(){
        return (VkPhysicalDeviceSamplerYcbcrConversionFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceSamplerYcbcrConversionFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 samplerYcbcrConversion) {
        super(new VkPhysicalDeviceSamplerYcbcrConversionFeatures(sType.getVk(), pNext.getVk(), samplerYcbcrConversion.getVk()));
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

    public VulkanBool32 getSamplerYcbcrConversion() {
        return new VulkanBool32(getVk().getSamplerYcbcrConversion());
    }

    public void setSamplerYcbcrConversion(VulkanBool32 samplerYcbcrConversion) {
        getVk().setSamplerYcbcrConversion(samplerYcbcrConversion.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSamplerYcbcrConversionFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSamplerYcbcrConversionFeatures> {
        public Array(VkPhysicalDeviceSamplerYcbcrConversionFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSamplerYcbcrConversionFeatures o){
            this(new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Array getVk(){
            return (VkPhysicalDeviceSamplerYcbcrConversionFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSamplerYcbcrConversionFeatures get(int i){
            return new VulkanPhysicalDeviceSamplerYcbcrConversionFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer getVk(){
            return (VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSamplerYcbcrConversionFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
