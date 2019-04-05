package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT extends VulkanObject {
    public VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT(){
        super(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT());
    }

    public VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT getVk(){
        return (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT) super.getVk();
    }

    public VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxVariableDescriptorCount) {
        super(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT(sType.getVk(), pNext.getVk(), maxVariableDescriptorCount.getVk()));
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

    public VulkanUInt32 getMaxVariableDescriptorCount() {
        return new VulkanUInt32(getVk().getMaxVariableDescriptorCount());
    }

    public void setMaxVariableDescriptorCount(VulkanUInt32 maxVariableDescriptorCount) {
        getVk().setMaxVariableDescriptorCount(maxVariableDescriptorCount.getVk());
    }


    public static class Array extends VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT> {
        public Array(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Array(count));
        }

        public Array(int count, VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT o){
            this(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Array getVk(){
            return (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT get(int i){
            return new VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer(value));
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer getVk(){
            return (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer.Array getVk(){
                return (VkDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer get(int i){
                return new VulkanDescriptorSetVariableDescriptorCountLayoutSupportEXT.Pointer(getVk().get(i));
            }
        }
    }
}
