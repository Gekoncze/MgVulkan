package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentLoadOp.html">khronos documentation</a>
 **/
public class VulkanAttachmentLoadOp extends VulkanEnum {
    public static final int LOAD = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD;
    public static final int CLEAR = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR;
    public static final int DONT_CARE = VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE;

    public VulkanAttachmentLoadOp(){
        super(new VkAttachmentLoadOp());
    }

    public VulkanAttachmentLoadOp(VkAttachmentLoadOp vk){
        super(vk);
    }

    @Override
    public VkAttachmentLoadOp getVk(){
        return (VkAttachmentLoadOp) super.getVk();
    }

    public VulkanAttachmentLoadOp(int value){
        super(new VkAttachmentLoadOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == LOAD) return "LOAD";
        if(getValue() == CLEAR) return "CLEAR";
        if(getValue() == DONT_CARE) return "DONT_CARE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanAttachmentLoadOp implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentLoadOp> {
        public Array(VkAttachmentLoadOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentLoadOp.Array(count));
        }

        public Array(int count, VulkanAttachmentLoadOp o){
            this(new VkAttachmentLoadOp.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentLoadOp.Array getVk(){
            return (VkAttachmentLoadOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentLoadOp get(int i){
            return new VulkanAttachmentLoadOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentLoadOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentLoadOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentLoadOp.Pointer(value));
        }

        @Override
        public VkAttachmentLoadOp.Pointer getVk(){
            return (VkAttachmentLoadOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentLoadOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentLoadOp.Pointer> {
            public Array(int count) {
                super(new VkAttachmentLoadOp.Pointer.Array(count));
            }

            public Array(VulkanAttachmentLoadOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentLoadOp.Pointer.Array getVk(){
                return (VkAttachmentLoadOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentLoadOp.Pointer get(int i){
                return new VulkanAttachmentLoadOp.Pointer(getVk().get(i));
            }
        }
    }
}
