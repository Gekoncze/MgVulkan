package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT extends VulkanObject {
    public VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT(){
        super(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT());
    }

    public VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT getVk(){
        return (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT) super.getVk();
    }
    public VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT(VulkanObject pNext, VulkanUInt32 descriptorSetCount, VulkanUInt32 pDescriptorCounts) {
        super(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(pNext.getVk(), descriptorSetCount.getVk(), pDescriptorCounts.getVk()));
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

    public VulkanUInt32 getDescriptorSetCount() {
        return new VulkanUInt32(getVk().getDescriptorSetCount());
    }

    public void setDescriptorSetCount(VulkanUInt32 descriptorSetCount) {
        getVk().setDescriptorSetCount(descriptorSetCount.getVk());
    }

    public VulkanUInt32 getPDescriptorCounts() {
        return new VulkanUInt32(getVk().getPDescriptorCounts());
    }

    public void setPDescriptorCounts(VulkanUInt32 pDescriptorCounts) {
        getVk().setPDescriptorCounts(pDescriptorCounts.getVk());
    }


    public static class Array extends VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT> {
        public Array(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Array(count));
        }

        public Array(int count, VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT o){
            this(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Array getVk(){
            return (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT get(int i){
            return new VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer(value));
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer getVk(){
            return (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer.Array getVk(){
                return (VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer get(int i){
                return new VulkanDescriptorSetVariableDescriptorCountAllocateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
