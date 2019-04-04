package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassInputAttachmentAspectCreateInfo.html">khronos documentation</a>
 **/
public class VulkanRenderPassInputAttachmentAspectCreateInfo extends VulkanObject {
    public VulkanRenderPassInputAttachmentAspectCreateInfo(){
        super(new VkRenderPassInputAttachmentAspectCreateInfo());
    }

    public VulkanRenderPassInputAttachmentAspectCreateInfo(VkRenderPassInputAttachmentAspectCreateInfo vk){
        super(vk);
    }

    @Override
    public VkRenderPassInputAttachmentAspectCreateInfo getVk(){
        return (VkRenderPassInputAttachmentAspectCreateInfo) super.getVk();
    }
    public VulkanRenderPassInputAttachmentAspectCreateInfo(VulkanObject pNext, VulkanUInt32 aspectReferenceCount, VulkanInputAttachmentAspectReference pAspectReferences) {
        super(new VkRenderPassInputAttachmentAspectCreateInfo(pNext.getVk(), aspectReferenceCount.getVk(), pAspectReferences.getVk()));
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

    public VulkanUInt32 getAspectReferenceCount() {
        return new VulkanUInt32(getVk().getAspectReferenceCount());
    }

    public void setAspectReferenceCount(VulkanUInt32 aspectReferenceCount) {
        getVk().setAspectReferenceCount(aspectReferenceCount.getVk());
    }

    public VulkanInputAttachmentAspectReference getPAspectReferences() {
        return new VulkanInputAttachmentAspectReference(getVk().getPAspectReferences());
    }

    public void setPAspectReferences(VulkanInputAttachmentAspectReference pAspectReferences) {
        getVk().setPAspectReferences(pAspectReferences.getVk());
    }


    public static class Array extends VulkanRenderPassInputAttachmentAspectCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassInputAttachmentAspectCreateInfo> {
        public Array(VkRenderPassInputAttachmentAspectCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassInputAttachmentAspectCreateInfo.Array(count));
        }

        public Array(int count, VulkanRenderPassInputAttachmentAspectCreateInfo o){
            this(new VkRenderPassInputAttachmentAspectCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassInputAttachmentAspectCreateInfo.Array getVk(){
            return (VkRenderPassInputAttachmentAspectCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassInputAttachmentAspectCreateInfo get(int i){
            return new VulkanRenderPassInputAttachmentAspectCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassInputAttachmentAspectCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassInputAttachmentAspectCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassInputAttachmentAspectCreateInfo.Pointer(value));
        }

        @Override
        public VkRenderPassInputAttachmentAspectCreateInfo.Pointer getVk(){
            return (VkRenderPassInputAttachmentAspectCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassInputAttachmentAspectCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassInputAttachmentAspectCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkRenderPassInputAttachmentAspectCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanRenderPassInputAttachmentAspectCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassInputAttachmentAspectCreateInfo.Pointer.Array getVk(){
                return (VkRenderPassInputAttachmentAspectCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassInputAttachmentAspectCreateInfo.Pointer get(int i){
                return new VulkanRenderPassInputAttachmentAspectCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
