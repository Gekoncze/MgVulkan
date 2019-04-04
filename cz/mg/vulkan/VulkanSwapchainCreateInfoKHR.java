package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainCreateInfoKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainCreateInfoKHR extends VulkanObject {
    public VulkanSwapchainCreateInfoKHR(){
        super(new VkSwapchainCreateInfoKHR());
    }

    public VulkanSwapchainCreateInfoKHR(VkSwapchainCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainCreateInfoKHR getVk(){
        return (VkSwapchainCreateInfoKHR) super.getVk();
    }
    public VulkanSwapchainCreateInfoKHR(VulkanObject pNext, VulkanSwapchainCreateFlagsKHR flags, VulkanSurfaceKHR surface, VulkanUInt32 minImageCount, VulkanFormat imageFormat, VulkanColorSpaceKHR imageColorSpace, VulkanExtent2D imageExtent, VulkanUInt32 imageArrayLayers, VulkanImageUsageFlags imageUsage, VulkanSharingMode imageSharingMode, VulkanUInt32 queueFamilyIndexCount, VulkanUInt32 pQueueFamilyIndices, VulkanSurfaceTransformFlagBitsKHR preTransform, VulkanCompositeAlphaFlagBitsKHR compositeAlpha, VulkanPresentModeKHR presentMode, VulkanBool32 clipped, VulkanSwapchainKHR oldSwapchain) {
        super(new VkSwapchainCreateInfoKHR(pNext.getVk(), flags.getVk(), surface.getVk(), minImageCount.getVk(), imageFormat.getVk(), imageColorSpace.getVk(), imageExtent.getVk(), imageArrayLayers.getVk(), imageUsage.getVk(), imageSharingMode.getVk(), queueFamilyIndexCount.getVk(), pQueueFamilyIndices.getVk(), preTransform.getVk(), compositeAlpha.getVk(), presentMode.getVk(), clipped.getVk(), oldSwapchain.getVk()));
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

    public VulkanSwapchainCreateFlagsKHR getFlags() {
        return new VulkanSwapchainCreateFlagsKHR(getVk().getFlags());
    }

    public void setFlags(VulkanSwapchainCreateFlagsKHR flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanSurfaceKHR getSurface() {
        return new VulkanSurfaceKHR(getVk().getSurface());
    }

    public void setSurface(VulkanSurfaceKHR surface) {
        getVk().setSurface(surface.getVk());
    }

    public VulkanUInt32 getMinImageCount() {
        return new VulkanUInt32(getVk().getMinImageCount());
    }

    public void setMinImageCount(VulkanUInt32 minImageCount) {
        getVk().setMinImageCount(minImageCount.getVk());
    }

    public VulkanFormat getImageFormat() {
        return new VulkanFormat(getVk().getImageFormat());
    }

    public void setImageFormat(VulkanFormat imageFormat) {
        getVk().setImageFormat(imageFormat.getVk());
    }

    public VulkanColorSpaceKHR getImageColorSpace() {
        return new VulkanColorSpaceKHR(getVk().getImageColorSpace());
    }

    public void setImageColorSpace(VulkanColorSpaceKHR imageColorSpace) {
        getVk().setImageColorSpace(imageColorSpace.getVk());
    }

    public VulkanExtent2D getImageExtent() {
        return new VulkanExtent2D(getVk().getImageExtent());
    }

    public void setImageExtent(VulkanExtent2D imageExtent) {
        getVk().setImageExtent(imageExtent.getVk());
    }

    public VulkanUInt32 getImageArrayLayers() {
        return new VulkanUInt32(getVk().getImageArrayLayers());
    }

    public void setImageArrayLayers(VulkanUInt32 imageArrayLayers) {
        getVk().setImageArrayLayers(imageArrayLayers.getVk());
    }

    public VulkanImageUsageFlags getImageUsage() {
        return new VulkanImageUsageFlags(getVk().getImageUsage());
    }

    public void setImageUsage(VulkanImageUsageFlags imageUsage) {
        getVk().setImageUsage(imageUsage.getVk());
    }

    public VulkanSharingMode getImageSharingMode() {
        return new VulkanSharingMode(getVk().getImageSharingMode());
    }

    public void setImageSharingMode(VulkanSharingMode imageSharingMode) {
        getVk().setImageSharingMode(imageSharingMode.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndexCount() {
        return new VulkanUInt32(getVk().getQueueFamilyIndexCount());
    }

    public void setQueueFamilyIndexCount(VulkanUInt32 queueFamilyIndexCount) {
        getVk().setQueueFamilyIndexCount(queueFamilyIndexCount.getVk());
    }

    public VulkanUInt32 getPQueueFamilyIndices() {
        return new VulkanUInt32(getVk().getPQueueFamilyIndices());
    }

    public void setPQueueFamilyIndices(VulkanUInt32 pQueueFamilyIndices) {
        getVk().setPQueueFamilyIndices(pQueueFamilyIndices.getVk());
    }

    public VulkanSurfaceTransformFlagBitsKHR getPreTransform() {
        return new VulkanSurfaceTransformFlagBitsKHR(getVk().getPreTransform());
    }

    public void setPreTransform(VulkanSurfaceTransformFlagBitsKHR preTransform) {
        getVk().setPreTransform(preTransform.getVk());
    }

    public VulkanCompositeAlphaFlagBitsKHR getCompositeAlpha() {
        return new VulkanCompositeAlphaFlagBitsKHR(getVk().getCompositeAlpha());
    }

    public void setCompositeAlpha(VulkanCompositeAlphaFlagBitsKHR compositeAlpha) {
        getVk().setCompositeAlpha(compositeAlpha.getVk());
    }

    public VulkanPresentModeKHR getPresentMode() {
        return new VulkanPresentModeKHR(getVk().getPresentMode());
    }

    public void setPresentMode(VulkanPresentModeKHR presentMode) {
        getVk().setPresentMode(presentMode.getVk());
    }

    public VulkanBool32 getClipped() {
        return new VulkanBool32(getVk().getClipped());
    }

    public void setClipped(VulkanBool32 clipped) {
        getVk().setClipped(clipped.getVk());
    }

    public VulkanSwapchainKHR getOldSwapchain() {
        return new VulkanSwapchainKHR(getVk().getOldSwapchain());
    }

    public void setOldSwapchain(VulkanSwapchainKHR oldSwapchain) {
        getVk().setOldSwapchain(oldSwapchain.getVk());
    }


    public static class Array extends VulkanSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateInfoKHR> {
        public Array(VkSwapchainCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSwapchainCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanSwapchainCreateInfoKHR o){
            this(new VkSwapchainCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainCreateInfoKHR.Array getVk(){
            return (VkSwapchainCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainCreateInfoKHR get(int i){
            return new VulkanSwapchainCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSwapchainCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSwapchainCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSwapchainCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkSwapchainCreateInfoKHR.Pointer getVk(){
            return (VkSwapchainCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSwapchainCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkSwapchainCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanSwapchainCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSwapchainCreateInfoKHR.Pointer.Array getVk(){
                return (VkSwapchainCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSwapchainCreateInfoKHR.Pointer get(int i){
                return new VulkanSwapchainCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
