package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatProperties.html">khronos documentation</a>
 **/
public class VulkanFormatProperties extends VulkanObject {
    public VulkanFormatProperties(){
        super(new VkFormatProperties());
    }

    public VulkanFormatProperties(VkFormatProperties vk){
        super(vk);
    }

    @Override
    public VkFormatProperties getVk(){
        return (VkFormatProperties) super.getVk();
    }

    public VulkanFormatProperties(VulkanFormatFeatureFlags linearTilingFeatures, VulkanFormatFeatureFlags optimalTilingFeatures, VulkanFormatFeatureFlags bufferFeatures) {
        super(new VkFormatProperties(linearTilingFeatures.getVk(), optimalTilingFeatures.getVk(), bufferFeatures.getVk()));
    }

    public VulkanFormatFeatureFlags getLinearTilingFeatures() {
        return new VulkanFormatFeatureFlags(getVk().getLinearTilingFeatures());
    }

    public void setLinearTilingFeatures(VulkanFormatFeatureFlags linearTilingFeatures) {
        getVk().setLinearTilingFeatures(linearTilingFeatures.getVk());
    }

    public VulkanFormatFeatureFlags getOptimalTilingFeatures() {
        return new VulkanFormatFeatureFlags(getVk().getOptimalTilingFeatures());
    }

    public void setOptimalTilingFeatures(VulkanFormatFeatureFlags optimalTilingFeatures) {
        getVk().setOptimalTilingFeatures(optimalTilingFeatures.getVk());
    }

    public VulkanFormatFeatureFlags getBufferFeatures() {
        return new VulkanFormatFeatureFlags(getVk().getBufferFeatures());
    }

    public void setBufferFeatures(VulkanFormatFeatureFlags bufferFeatures) {
        getVk().setBufferFeatures(bufferFeatures.getVk());
    }


    public static class Array extends VulkanFormatProperties implements cz.mg.collections.array.ReadonlyArray<VulkanFormatProperties> {
        public Array(VkFormatProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFormatProperties.Array(count));
        }

        public Array(int count, VulkanFormatProperties o){
            this(new VkFormatProperties.Array(count, o.getVk()));
        }

        @Override
        public VkFormatProperties.Array getVk(){
            return (VkFormatProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFormatProperties get(int i){
            return new VulkanFormatProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFormatProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFormatProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkFormatProperties.Pointer(value));
        }

        @Override
        public VkFormatProperties.Pointer getVk(){
            return (VkFormatProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFormatProperties.Pointer> {
            public Array(int count) {
                super(new VkFormatProperties.Pointer.Array(count));
            }

            public Array(VulkanFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFormatProperties.Pointer.Array getVk(){
                return (VkFormatProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFormatProperties.Pointer get(int i){
                return new VulkanFormatProperties.Pointer(getVk().get(i));
            }
        }
    }
}
