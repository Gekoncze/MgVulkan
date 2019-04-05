package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT extends VulkanObject {
    public VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT(){
        super(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT());
    }

    public VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT getVk(){
        return (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT) super.getVk();
    }
    public VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT(VulkanObject pNext, VulkanUInt32 bindingCount, VulkanDescriptorBindingFlagsEXT pBindingFlags) {
        super(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(pNext.getVk(), bindingCount.getVk(), pBindingFlags.getVk()));
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

    public VulkanUInt32 getBindingCount() {
        return new VulkanUInt32(getVk().getBindingCount());
    }

    public void setBindingCount(VulkanUInt32 bindingCount) {
        getVk().setBindingCount(bindingCount.getVk());
    }

    public VulkanDescriptorBindingFlagsEXT getPBindingFlags() {
        return new VulkanDescriptorBindingFlagsEXT(getVk().getPBindingFlags());
    }

    public void setPBindingFlags(VulkanDescriptorBindingFlagsEXT pBindingFlags) {
        getVk().setPBindingFlags(pBindingFlags.getVk());
    }


    public static class Array extends VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT> {
        public Array(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT o){
            this(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Array getVk(){
            return (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT get(int i){
            return new VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer getVk(){
            return (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer get(int i){
                return new VulkanDescriptorSetLayoutBindingFlagsCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
