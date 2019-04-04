package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageLayout.html">khronos documentation</a>
 **/
public class VulkanImageLayout extends VulkanEnum {
    public static final int UNDEFINED = VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED;
    public static final int GENERAL = VkImageLayout.VK_IMAGE_LAYOUT_GENERAL;
    public static final int COLOR_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL;
    public static final int SHADER_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
    public static final int TRANSFER_SRC_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL;
    public static final int TRANSFER_DST_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
    public static final int PREINITIALIZED = VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED;
    public static final int DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL;
    public static final int DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL;
    public static final int PRESENT_SRC_KHR = VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR;
    public static final int SHARED_PRESENT_KHR = VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR;
    public static final int DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR;
    public static final int DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR;

    public VulkanImageLayout(){
        super(new VkImageLayout());
    }

    public VulkanImageLayout(VkImageLayout vk){
        super(vk);
    }

    @Override
    public VkImageLayout getVk(){
        return (VkImageLayout) super.getVk();
    }

    public VulkanImageLayout(int value){
        super(new VkImageLayout(value));
    }

    @Override
    public String toString() {
        if(getValue() == UNDEFINED) return "UNDEFINED";
        if(getValue() == GENERAL) return "GENERAL";
        if(getValue() == COLOR_ATTACHMENT_OPTIMAL) return "COLOR_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT_OPTIMAL) return "DEPTH_STENCIL_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_STENCIL_READ_ONLY_OPTIMAL) return "DEPTH_STENCIL_READ_ONLY_OPTIMAL";
        if(getValue() == SHADER_READ_ONLY_OPTIMAL) return "SHADER_READ_ONLY_OPTIMAL";
        if(getValue() == TRANSFER_SRC_OPTIMAL) return "TRANSFER_SRC_OPTIMAL";
        if(getValue() == TRANSFER_DST_OPTIMAL) return "TRANSFER_DST_OPTIMAL";
        if(getValue() == PREINITIALIZED) return "PREINITIALIZED";
        if(getValue() == DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL) return "DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL";
        if(getValue() == DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL) return "DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL";
        if(getValue() == PRESENT_SRC_KHR) return "PRESENT_SRC_KHR";
        if(getValue() == SHARED_PRESENT_KHR) return "SHARED_PRESENT_KHR";
        if(getValue() == DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR) return "DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR";
        if(getValue() == DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR) return "DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanImageLayout implements cz.mg.collections.array.ReadonlyArray<VulkanImageLayout> {
        public Array(VkImageLayout.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageLayout.Array(count));
        }

        public Array(int count, VulkanImageLayout o){
            this(new VkImageLayout.Array(count, o.getVk()));
        }

        @Override
        public VkImageLayout.Array getVk(){
            return (VkImageLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageLayout get(int i){
            return new VulkanImageLayout(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageLayout.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageLayout.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageLayout.Pointer(value));
        }

        @Override
        public VkImageLayout.Pointer getVk(){
            return (VkImageLayout.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageLayout.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageLayout.Pointer> {
            public Array(int count) {
                super(new VkImageLayout.Pointer.Array(count));
            }

            public Array(VulkanImageLayout[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageLayout.Pointer.Array getVk(){
                return (VkImageLayout.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageLayout.Pointer get(int i){
                return new VulkanImageLayout.Pointer(getVk().get(i));
            }
        }
    }
}
