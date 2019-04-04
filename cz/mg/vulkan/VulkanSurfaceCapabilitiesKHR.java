package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCapabilitiesKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceCapabilitiesKHR extends VulkanObject {
    public VulkanSurfaceCapabilitiesKHR(){
        super(new VkSurfaceCapabilitiesKHR());
    }

    public VulkanSurfaceCapabilitiesKHR(VkSurfaceCapabilitiesKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceCapabilitiesKHR getVk(){
        return (VkSurfaceCapabilitiesKHR) super.getVk();
    }

    public VulkanSurfaceCapabilitiesKHR(VulkanUInt32 minImageCount, VulkanUInt32 maxImageCount, VulkanExtent2D currentExtent, VulkanExtent2D minImageExtent, VulkanExtent2D maxImageExtent, VulkanUInt32 maxImageArrayLayers, VulkanSurfaceTransformFlagsKHR supportedTransforms, VulkanSurfaceTransformFlagBitsKHR currentTransform, VulkanCompositeAlphaFlagsKHR supportedCompositeAlpha, VulkanImageUsageFlags supportedUsageFlags) {
        super(new VkSurfaceCapabilitiesKHR(minImageCount.getVk(), maxImageCount.getVk(), currentExtent.getVk(), minImageExtent.getVk(), maxImageExtent.getVk(), maxImageArrayLayers.getVk(), supportedTransforms.getVk(), currentTransform.getVk(), supportedCompositeAlpha.getVk(), supportedUsageFlags.getVk()));
    }

    public VulkanUInt32 getMinImageCount() {
        return new VulkanUInt32(getVk().getMinImageCount());
    }

    public void setMinImageCount(VulkanUInt32 minImageCount) {
        getVk().setMinImageCount(minImageCount.getVk());
    }

    public VulkanUInt32 getMaxImageCount() {
        return new VulkanUInt32(getVk().getMaxImageCount());
    }

    public void setMaxImageCount(VulkanUInt32 maxImageCount) {
        getVk().setMaxImageCount(maxImageCount.getVk());
    }

    public VulkanExtent2D getCurrentExtent() {
        return new VulkanExtent2D(getVk().getCurrentExtent());
    }

    public void setCurrentExtent(VulkanExtent2D currentExtent) {
        getVk().setCurrentExtent(currentExtent.getVk());
    }

    public VulkanExtent2D getMinImageExtent() {
        return new VulkanExtent2D(getVk().getMinImageExtent());
    }

    public void setMinImageExtent(VulkanExtent2D minImageExtent) {
        getVk().setMinImageExtent(minImageExtent.getVk());
    }

    public VulkanExtent2D getMaxImageExtent() {
        return new VulkanExtent2D(getVk().getMaxImageExtent());
    }

    public void setMaxImageExtent(VulkanExtent2D maxImageExtent) {
        getVk().setMaxImageExtent(maxImageExtent.getVk());
    }

    public VulkanUInt32 getMaxImageArrayLayers() {
        return new VulkanUInt32(getVk().getMaxImageArrayLayers());
    }

    public void setMaxImageArrayLayers(VulkanUInt32 maxImageArrayLayers) {
        getVk().setMaxImageArrayLayers(maxImageArrayLayers.getVk());
    }

    public VulkanSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VulkanSurfaceTransformFlagsKHR(getVk().getSupportedTransforms());
    }

    public void setSupportedTransforms(VulkanSurfaceTransformFlagsKHR supportedTransforms) {
        getVk().setSupportedTransforms(supportedTransforms.getVk());
    }

    public VulkanSurfaceTransformFlagBitsKHR getCurrentTransform() {
        return new VulkanSurfaceTransformFlagBitsKHR(getVk().getCurrentTransform());
    }

    public void setCurrentTransform(VulkanSurfaceTransformFlagBitsKHR currentTransform) {
        getVk().setCurrentTransform(currentTransform.getVk());
    }

    public VulkanCompositeAlphaFlagsKHR getSupportedCompositeAlpha() {
        return new VulkanCompositeAlphaFlagsKHR(getVk().getSupportedCompositeAlpha());
    }

    public void setSupportedCompositeAlpha(VulkanCompositeAlphaFlagsKHR supportedCompositeAlpha) {
        getVk().setSupportedCompositeAlpha(supportedCompositeAlpha.getVk());
    }

    public VulkanImageUsageFlags getSupportedUsageFlags() {
        return new VulkanImageUsageFlags(getVk().getSupportedUsageFlags());
    }

    public void setSupportedUsageFlags(VulkanImageUsageFlags supportedUsageFlags) {
        getVk().setSupportedUsageFlags(supportedUsageFlags.getVk());
    }


    public static class Array extends VulkanSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilitiesKHR> {
        public Array(VkSurfaceCapabilitiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceCapabilitiesKHR.Array(count));
        }

        public Array(int count, VulkanSurfaceCapabilitiesKHR o){
            this(new VkSurfaceCapabilitiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceCapabilitiesKHR.Array getVk(){
            return (VkSurfaceCapabilitiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceCapabilitiesKHR get(int i){
            return new VulkanSurfaceCapabilitiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceCapabilitiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceCapabilitiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceCapabilitiesKHR.Pointer(value));
        }

        @Override
        public VkSurfaceCapabilitiesKHR.Pointer getVk(){
            return (VkSurfaceCapabilitiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilitiesKHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceCapabilitiesKHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceCapabilitiesKHR.Pointer.Array getVk(){
                return (VkSurfaceCapabilitiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceCapabilitiesKHR.Pointer get(int i){
                return new VulkanSurfaceCapabilitiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
