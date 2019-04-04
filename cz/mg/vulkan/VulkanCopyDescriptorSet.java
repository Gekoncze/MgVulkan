package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCopyDescriptorSet.html">khronos documentation</a>
 **/
public class VulkanCopyDescriptorSet extends VulkanObject {
    public VulkanCopyDescriptorSet(){
        super(new VkCopyDescriptorSet());
    }

    public VulkanCopyDescriptorSet(VkCopyDescriptorSet vk){
        super(vk);
    }

    @Override
    public VkCopyDescriptorSet getVk(){
        return (VkCopyDescriptorSet) super.getVk();
    }

    public VulkanCopyDescriptorSet(VulkanStructureType sType, VulkanObject pNext, VulkanDescriptorSet srcSet, VulkanUInt32 srcBinding, VulkanUInt32 srcArrayElement, VulkanDescriptorSet dstSet, VulkanUInt32 dstBinding, VulkanUInt32 dstArrayElement, VulkanUInt32 descriptorCount) {
        super(new VkCopyDescriptorSet(sType.getVk(), pNext.getVk(), srcSet.getVk(), srcBinding.getVk(), srcArrayElement.getVk(), dstSet.getVk(), dstBinding.getVk(), dstArrayElement.getVk(), descriptorCount.getVk()));
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

    public VulkanDescriptorSet getSrcSet() {
        return new VulkanDescriptorSet(getVk().getSrcSet());
    }

    public void setSrcSet(VulkanDescriptorSet srcSet) {
        getVk().setSrcSet(srcSet.getVk());
    }

    public VulkanUInt32 getSrcBinding() {
        return new VulkanUInt32(getVk().getSrcBinding());
    }

    public void setSrcBinding(VulkanUInt32 srcBinding) {
        getVk().setSrcBinding(srcBinding.getVk());
    }

    public VulkanUInt32 getSrcArrayElement() {
        return new VulkanUInt32(getVk().getSrcArrayElement());
    }

    public void setSrcArrayElement(VulkanUInt32 srcArrayElement) {
        getVk().setSrcArrayElement(srcArrayElement.getVk());
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


    public static class Array extends VulkanCopyDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VulkanCopyDescriptorSet> {
        public Array(VkCopyDescriptorSet.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCopyDescriptorSet.Array(count));
        }

        public Array(int count, VulkanCopyDescriptorSet o){
            this(new VkCopyDescriptorSet.Array(count, o.getVk()));
        }

        @Override
        public VkCopyDescriptorSet.Array getVk(){
            return (VkCopyDescriptorSet.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCopyDescriptorSet get(int i){
            return new VulkanCopyDescriptorSet(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCopyDescriptorSet.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCopyDescriptorSet.Pointer());
        }

        public Pointer(long value) {
            this(new VkCopyDescriptorSet.Pointer(value));
        }

        @Override
        public VkCopyDescriptorSet.Pointer getVk(){
            return (VkCopyDescriptorSet.Pointer) super.getVk();
        }

        public static class Array extends VulkanCopyDescriptorSet.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCopyDescriptorSet.Pointer> {
            public Array(int count) {
                super(new VkCopyDescriptorSet.Pointer.Array(count));
            }

            public Array(VulkanCopyDescriptorSet[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCopyDescriptorSet.Pointer.Array getVk(){
                return (VkCopyDescriptorSet.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCopyDescriptorSet.Pointer get(int i){
                return new VulkanCopyDescriptorSet.Pointer(getVk().get(i));
            }
        }
    }
}
