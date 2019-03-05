package cz.mg.vulkan.handles;

import cz.mg.vulkan.enums.VulkanFormat;
import cz.mg.vulkan.enums.VulkanImageViewType;
import cz.mg.vulkan.jna.handles.VkImageView;
import cz.mg.vulkan.structures.VulkanComponentMapping;
import cz.mg.vulkan.structures.VulkanImageSubresourceRange;


public class VulkanImageView {
    private final VulkanImage parent;
    public final VkImageView.ByValue handle;

    public VulkanImageView(VulkanImage parent, VkImageView.ByValue handle) {
        if(parent == null || handle == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = handle;
    }

    public VulkanImageView(VulkanImage parent, VulkanImageViewType viewType, VulkanFormat format, VulkanComponentMapping componentMapping, VulkanImageSubresourceRange subresourceRange) {
        if(parent == null || viewType == null || format == null || componentMapping == null || subresourceRange == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = parent.getParent().getParent().getParent().getParent().vks.vkCreateImageView(
                parent.getParent().handle,
                parent.handle,
                viewType.enums,
                format.enums,
                componentMapping.structure,
                subresourceRange.structure
        );
    }

    @Override
    protected void finalize() {
        parent.getParent().getParent().getParent().getParent().vks.vkDestroyImageView(parent.getParent().handle, handle);
    }
}
