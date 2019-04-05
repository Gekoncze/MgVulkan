package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetLayoutSupport extends VulkanObject {
    public VulkanDescriptorSetLayoutSupport(){
        super(new VkDescriptorSetLayoutSupport());
    }

    public VulkanDescriptorSetLayoutSupport(VkDescriptorSetLayoutSupport vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutSupport getVk(){
        return (VkDescriptorSetLayoutSupport) super.getVk();
    }

    public VulkanDescriptorSetLayoutSupport(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 supported) {
        super(new VkDescriptorSetLayoutSupport(sType.getVk(), pNext.getVk(), supported.getVk()));
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

    public VulkanBool32 getSupported() {
        return new VulkanBool32(getVk().getSupported());
    }

    public void setSupported(VulkanBool32 supported) {
        getVk().setSupported(supported.getVk());
    }


    public static class Array extends VulkanDescriptorSetLayoutSupport implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutSupport> {
        public Array(VkDescriptorSetLayoutSupport.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutSupport.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutSupport o){
            this(new VkDescriptorSetLayoutSupport.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutSupport.Array getVk(){
            return (VkDescriptorSetLayoutSupport.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutSupport get(int i){
            return new VulkanDescriptorSetLayoutSupport(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutSupport.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutSupport.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutSupport.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutSupport.Pointer getVk(){
            return (VkDescriptorSetLayoutSupport.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutSupport.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutSupport.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutSupport.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutSupport[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutSupport.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutSupport.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutSupport.Pointer get(int i){
                return new VulkanDescriptorSetLayoutSupport.Pointer(getVk().get(i));
            }
        }
    }
}
