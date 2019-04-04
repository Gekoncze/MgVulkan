package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInputAttachmentAspectReference.html">khronos documentation</a>
 **/
public class VulkanInputAttachmentAspectReference extends VulkanObject {
    public VulkanInputAttachmentAspectReference(){
        super(new VkInputAttachmentAspectReference());
    }

    public VulkanInputAttachmentAspectReference(VkInputAttachmentAspectReference vk){
        super(vk);
    }

    @Override
    public VkInputAttachmentAspectReference getVk(){
        return (VkInputAttachmentAspectReference) super.getVk();
    }

    public VulkanInputAttachmentAspectReference(VulkanUInt32 subpass, VulkanUInt32 inputAttachmentIndex, VulkanImageAspectFlags aspectMask) {
        super(new VkInputAttachmentAspectReference(subpass.getVk(), inputAttachmentIndex.getVk(), aspectMask.getVk()));
    }

    public VulkanUInt32 getSubpass() {
        return new VulkanUInt32(getVk().getSubpass());
    }

    public void setSubpass(VulkanUInt32 subpass) {
        getVk().setSubpass(subpass.getVk());
    }

    public VulkanUInt32 getInputAttachmentIndex() {
        return new VulkanUInt32(getVk().getInputAttachmentIndex());
    }

    public void setInputAttachmentIndex(VulkanUInt32 inputAttachmentIndex) {
        getVk().setInputAttachmentIndex(inputAttachmentIndex.getVk());
    }

    public VulkanImageAspectFlags getAspectMask() {
        return new VulkanImageAspectFlags(getVk().getAspectMask());
    }

    public void setAspectMask(VulkanImageAspectFlags aspectMask) {
        getVk().setAspectMask(aspectMask.getVk());
    }


    public static class Array extends VulkanInputAttachmentAspectReference implements cz.mg.collections.array.ReadonlyArray<VulkanInputAttachmentAspectReference> {
        public Array(VkInputAttachmentAspectReference.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInputAttachmentAspectReference.Array(count));
        }

        public Array(int count, VulkanInputAttachmentAspectReference o){
            this(new VkInputAttachmentAspectReference.Array(count, o.getVk()));
        }

        @Override
        public VkInputAttachmentAspectReference.Array getVk(){
            return (VkInputAttachmentAspectReference.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInputAttachmentAspectReference get(int i){
            return new VulkanInputAttachmentAspectReference(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInputAttachmentAspectReference.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInputAttachmentAspectReference.Pointer());
        }

        public Pointer(long value) {
            this(new VkInputAttachmentAspectReference.Pointer(value));
        }

        @Override
        public VkInputAttachmentAspectReference.Pointer getVk(){
            return (VkInputAttachmentAspectReference.Pointer) super.getVk();
        }

        public static class Array extends VulkanInputAttachmentAspectReference.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInputAttachmentAspectReference.Pointer> {
            public Array(int count) {
                super(new VkInputAttachmentAspectReference.Pointer.Array(count));
            }

            public Array(VulkanInputAttachmentAspectReference[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInputAttachmentAspectReference.Pointer.Array getVk(){
                return (VkInputAttachmentAspectReference.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInputAttachmentAspectReference.Pointer get(int i){
                return new VulkanInputAttachmentAspectReference.Pointer(getVk().get(i));
            }
        }
    }
}
