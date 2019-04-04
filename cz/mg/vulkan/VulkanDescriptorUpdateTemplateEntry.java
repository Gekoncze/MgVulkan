package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateEntry.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateEntry extends VulkanObject {
    public VulkanDescriptorUpdateTemplateEntry(){
        super(new VkDescriptorUpdateTemplateEntry());
    }

    public VulkanDescriptorUpdateTemplateEntry(VkDescriptorUpdateTemplateEntry vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateEntry getVk(){
        return (VkDescriptorUpdateTemplateEntry) super.getVk();
    }

    public VulkanDescriptorUpdateTemplateEntry(VulkanUInt32 dstBinding, VulkanUInt32 dstArrayElement, VulkanUInt32 descriptorCount, VulkanDescriptorType descriptorType, VulkanSize offset, VulkanSize stride) {
        super(new VkDescriptorUpdateTemplateEntry(dstBinding.getVk(), dstArrayElement.getVk(), descriptorCount.getVk(), descriptorType.getVk(), offset.getVk(), stride.getVk()));
    }

    public VulkanUInt32 getDstBinding() {
        return new VulkanUInt32(getVk().getDstBinding());
    }

    public void setDstBinding(VulkanUInt32 dstBinding) {
        getVk().setDstBinding(dstBinding.getVk());
    }

    public VulkanUInt32 getDstArrayElement() {
        return new VulkanUInt32(getVk().getDstArrayElement());
    }

    public void setDstArrayElement(VulkanUInt32 dstArrayElement) {
        getVk().setDstArrayElement(dstArrayElement.getVk());
    }

    public VulkanUInt32 getDescriptorCount() {
        return new VulkanUInt32(getVk().getDescriptorCount());
    }

    public void setDescriptorCount(VulkanUInt32 descriptorCount) {
        getVk().setDescriptorCount(descriptorCount.getVk());
    }

    public VulkanDescriptorType getDescriptorType() {
        return new VulkanDescriptorType(getVk().getDescriptorType());
    }

    public void setDescriptorType(VulkanDescriptorType descriptorType) {
        getVk().setDescriptorType(descriptorType.getVk());
    }

    public VulkanSize getOffset() {
        return new VulkanSize(getVk().getOffset());
    }

    public void setOffset(VulkanSize offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanSize getStride() {
        return new VulkanSize(getVk().getStride());
    }

    public void setStride(VulkanSize stride) {
        getVk().setStride(stride.getVk());
    }


    public static class Array extends VulkanDescriptorUpdateTemplateEntry implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateEntry> {
        public Array(VkDescriptorUpdateTemplateEntry.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorUpdateTemplateEntry.Array(count));
        }

        public Array(int count, VulkanDescriptorUpdateTemplateEntry o){
            this(new VkDescriptorUpdateTemplateEntry.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplateEntry.Array getVk(){
            return (VkDescriptorUpdateTemplateEntry.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplateEntry get(int i){
            return new VulkanDescriptorUpdateTemplateEntry(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorUpdateTemplateEntry.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorUpdateTemplateEntry.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorUpdateTemplateEntry.Pointer(value));
        }

        @Override
        public VkDescriptorUpdateTemplateEntry.Pointer getVk(){
            return (VkDescriptorUpdateTemplateEntry.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorUpdateTemplateEntry.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateEntry.Pointer> {
            public Array(int count) {
                super(new VkDescriptorUpdateTemplateEntry.Pointer.Array(count));
            }

            public Array(VulkanDescriptorUpdateTemplateEntry[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorUpdateTemplateEntry.Pointer.Array getVk(){
                return (VkDescriptorUpdateTemplateEntry.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorUpdateTemplateEntry.Pointer get(int i){
                return new VulkanDescriptorUpdateTemplateEntry.Pointer(getVk().get(i));
            }
        }
    }
}
