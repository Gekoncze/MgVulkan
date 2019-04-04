package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentDescriptionFlags.html">khronos documentation</a>
 **/
public class VulkanAttachmentDescriptionFlags extends VulkanFlags {
    public VulkanAttachmentDescriptionFlags(){
        super(new VkAttachmentDescriptionFlags());
    }

    public VulkanAttachmentDescriptionFlags(VkAttachmentDescriptionFlags vk){
        super(vk);
    }

    @Override
    public VkAttachmentDescriptionFlags getVk(){
        return (VkAttachmentDescriptionFlags) super.getVk();
    }

    public VulkanAttachmentDescriptionFlags(int value){
        super(new VkAttachmentDescriptionFlags(value));
    }

    public static class Array extends VulkanAttachmentDescriptionFlags implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescriptionFlags> {
        public Array(VkAttachmentDescriptionFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentDescriptionFlags.Array(count));
        }

        public Array(int count, VulkanAttachmentDescriptionFlags o){
            this(new VkAttachmentDescriptionFlags.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentDescriptionFlags.Array getVk(){
            return (VkAttachmentDescriptionFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentDescriptionFlags get(int i){
            return new VulkanAttachmentDescriptionFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentDescriptionFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentDescriptionFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentDescriptionFlags.Pointer(value));
        }

        @Override
        public VkAttachmentDescriptionFlags.Pointer getVk(){
            return (VkAttachmentDescriptionFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentDescriptionFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescriptionFlags.Pointer> {
            public Array(int count) {
                super(new VkAttachmentDescriptionFlags.Pointer.Array(count));
            }

            public Array(VulkanAttachmentDescriptionFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentDescriptionFlags.Pointer.Array getVk(){
                return (VkAttachmentDescriptionFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentDescriptionFlags.Pointer get(int i){
                return new VulkanAttachmentDescriptionFlags.Pointer(getVk().get(i));
            }
        }
    }
}
