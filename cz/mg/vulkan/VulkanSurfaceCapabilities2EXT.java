package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCapabilities2EXT.html">khronos documentation</a>
 **/
public class VulkanSurfaceCapabilities2EXT extends VulkanObject {
    public VulkanSurfaceCapabilities2EXT(){
        super(new VkSurfaceCapabilities2EXT());
    }

    public VulkanSurfaceCapabilities2EXT(VkSurfaceCapabilities2EXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCapabilities2EXT getVk(){
        return (VkSurfaceCapabilities2EXT) super.getVk();
    }

    public VulkanSurfaceCapabilities2EXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 minImageCount, VulkanUInt32 maxImageCount, VulkanExtent2D currentExtent, VulkanExtent2D minImageExtent, VulkanExtent2D maxImageExtent, VulkanUInt32 maxImageArrayLayers, VulkanSurfaceTransformFlagsKHR supportedTransforms, VulkanSurfaceTransformFlagBitsKHR currentTransform, VulkanCompositeAlphaFlagsKHR supportedCompositeAlpha, VulkanImageUsageFlags supportedUsageFlags, VulkanSurfaceCounterFlagsEXT supportedSurfaceCounters) {
        super(new VkSurfaceCapabilities2EXT(sType.getVk(), pNext.getVk(), minImageCount.getVk(), maxImageCount.getVk(), currentExtent.getVk(), minImageExtent.getVk(), maxImageExtent.getVk(), maxImageArrayLayers.getVk(), supportedTransforms.getVk(), currentTransform.getVk(), supportedCompositeAlpha.getVk(), supportedUsageFlags.getVk(), supportedSurfaceCounters.getVk()));
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

    public VulkanSurfaceCounterFlagsEXT getSupportedSurfaceCounters() {
        return new VulkanSurfaceCounterFlagsEXT(getVk().getSupportedSurfaceCounters());
    }

    public void setSupportedSurfaceCounters(VulkanSurfaceCounterFlagsEXT supportedSurfaceCounters) {
        getVk().setSupportedSurfaceCounters(supportedSurfaceCounters.getVk());
    }


    public static class Array extends VulkanSurfaceCapabilities2EXT implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilities2EXT> {
        public Array(VkSurfaceCapabilities2EXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceCapabilities2EXT.Array(count));
        }

        public Array(int count, VulkanSurfaceCapabilities2EXT o){
            this(new VkSurfaceCapabilities2EXT.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceCapabilities2EXT.Array getVk(){
            return (VkSurfaceCapabilities2EXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceCapabilities2EXT get(int i){
            return new VulkanSurfaceCapabilities2EXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceCapabilities2EXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceCapabilities2EXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceCapabilities2EXT.Pointer(value));
        }

        @Override
        public VkSurfaceCapabilities2EXT.Pointer getVk(){
            return (VkSurfaceCapabilities2EXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceCapabilities2EXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceCapabilities2EXT.Pointer> {
            public Array(int count) {
                super(new VkSurfaceCapabilities2EXT.Pointer.Array(count));
            }

            public Array(VulkanSurfaceCapabilities2EXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceCapabilities2EXT.Pointer.Array getVk(){
                return (VkSurfaceCapabilities2EXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceCapabilities2EXT.Pointer get(int i){
                return new VulkanSurfaceCapabilities2EXT.Pointer(getVk().get(i));
            }
        }
    }
}
