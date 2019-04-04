package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentStoreOp.html">khronos documentation</a>
 **/
public class VulkanAttachmentStoreOp extends VulkanEnum {
    public static final int STORE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE;
    public static final int DONT_CARE = VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE;

    public VulkanAttachmentStoreOp(){
        super(new VkAttachmentStoreOp());
    }

    public VulkanAttachmentStoreOp(VkAttachmentStoreOp vk){
        super(vk);
    }

    @Override
    public VkAttachmentStoreOp getVk(){
        return (VkAttachmentStoreOp) super.getVk();
    }

    public VulkanAttachmentStoreOp(int value){
        super(new VkAttachmentStoreOp(value));
    }

    @Override
    public String toString() {
        if(getValue() == STORE) return "STORE";
        if(getValue() == DONT_CARE) return "DONT_CARE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanAttachmentStoreOp implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentStoreOp> {
        public Array(VkAttachmentStoreOp.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentStoreOp.Array(count));
        }

        public Array(int count, VulkanAttachmentStoreOp o){
            this(new VkAttachmentStoreOp.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentStoreOp.Array getVk(){
            return (VkAttachmentStoreOp.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentStoreOp get(int i){
            return new VulkanAttachmentStoreOp(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentStoreOp.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentStoreOp.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentStoreOp.Pointer(value));
        }

        @Override
        public VkAttachmentStoreOp.Pointer getVk(){
            return (VkAttachmentStoreOp.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentStoreOp.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentStoreOp.Pointer> {
            public Array(int count) {
                super(new VkAttachmentStoreOp.Pointer.Array(count));
            }

            public Array(VulkanAttachmentStoreOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentStoreOp.Pointer.Array getVk(){
                return (VkAttachmentStoreOp.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentStoreOp.Pointer get(int i){
                return new VulkanAttachmentStoreOp.Pointer(getVk().get(i));
            }
        }
    }
}
