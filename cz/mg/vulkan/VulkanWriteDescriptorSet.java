package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkWriteDescriptorSet.html">khronos documentation</a>
 **/
public class VulkanWriteDescriptorSet extends VulkanObject {
    public VulkanWriteDescriptorSet(){
        super(new VkWriteDescriptorSet());
    }

    public VulkanWriteDescriptorSet(VkWriteDescriptorSet vk){
        super(vk);
    }

    @Override
    public VkWriteDescriptorSet getVk(){
        return (VkWriteDescriptorSet) super.getVk();
    }

    public VulkanWriteDescriptorSet(VulkanStructureType sType, VulkanObject pNext, VulkanDescriptorSet dstSet, VulkanUInt32 dstBinding, VulkanUInt32 dstArrayElement, VulkanUInt32 descriptorCount, VulkanDescriptorType descriptorType, VulkanDescriptorImageInfo pImageInfo, VulkanDescriptorBufferInfo pBufferInfo, VulkanBufferView pTexelBufferView) {
        super(new VkWriteDescriptorSet(sType.getVk(), pNext.getVk(), dstSet.getVk(), dstBinding.getVk(), dstArrayElement.getVk(), descriptorCount.getVk(), descriptorType.getVk(), pImageInfo.getVk(), pBufferInfo.getVk(), pTexelBufferView.getVk()));
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

    public VulkanDescriptorSet getDstSet() {
        return new VulkanDescriptorSet(getVk().getDstSet());
    }

    public void setDstSet(VulkanDescriptorSet dstSet) {
        getVk().setDstSet(dstSet.getVk());
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

    public VulkanDescriptorImageInfo getPImageInfo() {
        return new VulkanDescriptorImageInfo(getVk().getPImageInfo());
    }

    public void setPImageInfo(VulkanDescriptorImageInfo pImageInfo) {
        getVk().setPImageInfo(pImageInfo.getVk());
    }

    public VulkanDescriptorBufferInfo getPBufferInfo() {
        return new VulkanDescriptorBufferInfo(getVk().getPBufferInfo());
    }

    public void setPBufferInfo(VulkanDescriptorBufferInfo pBufferInfo) {
        getVk().setPBufferInfo(pBufferInfo.getVk());
    }

    public VulkanBufferView getPTexelBufferView() {
        return new VulkanBufferView(getVk().getPTexelBufferView());
    }

    public void setPTexelBufferView(VulkanBufferView pTexelBufferView) {
        getVk().setPTexelBufferView(pTexelBufferView.getVk());
    }


    public static class Array extends VulkanWriteDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VulkanWriteDescriptorSet> {
        public Array(VkWriteDescriptorSet.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkWriteDescriptorSet.Array(count));
        }

        public Array(int count, VulkanWriteDescriptorSet o){
            this(new VkWriteDescriptorSet.Array(count, o.getVk()));
        }

        @Override
        public VkWriteDescriptorSet.Array getVk(){
            return (VkWriteDescriptorSet.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanWriteDescriptorSet get(int i){
            return new VulkanWriteDescriptorSet(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkWriteDescriptorSet.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkWriteDescriptorSet.Pointer());
        }

        public Pointer(long value) {
            this(new VkWriteDescriptorSet.Pointer(value));
        }

        @Override
        public VkWriteDescriptorSet.Pointer getVk(){
            return (VkWriteDescriptorSet.Pointer) super.getVk();
        }

        public static class Array extends VulkanWriteDescriptorSet.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanWriteDescriptorSet.Pointer> {
            public Array(int count) {
                super(new VkWriteDescriptorSet.Pointer.Array(count));
            }

            public Array(VulkanWriteDescriptorSet[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkWriteDescriptorSet.Pointer.Array getVk(){
                return (VkWriteDescriptorSet.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanWriteDescriptorSet.Pointer get(int i){
                return new VulkanWriteDescriptorSet.Pointer(getVk().get(i));
            }
        }
    }
}
