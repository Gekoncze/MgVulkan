package cz.mg.vulkan.handles;

import cz.mg.vulkan.enums.*;
import cz.mg.vulkan.flags.VulkanImageUsageFlags;
import cz.mg.vulkan.flags.VulkanSampleCountFlags;
import cz.mg.vulkan.jna.handles.VkImage;


public class VulkanImage {
    private final VulkanDevice parent;
    public final VkImage.ByValue handle;

    public VulkanImage(VulkanDevice parent, VkImage.ByValue handle) {
        if(parent == null || handle == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = handle;
    }

    public VulkanImage(VulkanDevice parent, VulkanImageType imageType, int width, int height, int depth, VulkanFormat format, VulkanSampleCountFlags sampleCount, VulkanImageTiling tiling, VulkanImageUsageFlags usage, VulkanSharingMode sharing, VulkanImageLayout layout) {
        if(parent == null || imageType == null || width < 0 || height < 0 || depth < 0 || format == null || sampleCount == null || tiling == null || usage == null || sharing == null || layout == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = parent.getParent().getParent().getParent().vks.vkCreateImage(
                parent.handle,
                imageType.enums,
                width, height, depth,
                format.enums,
                sampleCount.flags,
                tiling.enums,
                usage.flags,
                sharing.enums,
                layout.enums
        );
    }

    public VulkanDevice getParent() {
        return parent;
    }

    @Override
    protected void finalize() {
        parent.getParent().getParent().getParent().vks.vkDestroyImage(parent.handle, handle);
    }
}
