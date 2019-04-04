package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolSize.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolSize extends VulkanObject {
    public VulkanDescriptorPoolSize(){
        super(new VkDescriptorPoolSize());
    }

    public VulkanDescriptorPoolSize(VkDescriptorPoolSize vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolSize getVk(){
        return (VkDescriptorPoolSize) super.getVk();
    }

    public VulkanDescriptorPoolSize(VulkanDescriptorType type, VulkanUInt32 descriptorCount) {
        super(new VkDescriptorPoolSize(type.getVk(), descriptorCount.getVk()));
    }

    public VulkanDescriptorType getType() {
        return new VulkanDescriptorType(getVk().getType());
    }

    public void setType(VulkanDescriptorType type) {
        getVk().setType(type.getVk());
    }

    public VulkanUInt32 getDescriptorCount() {
        return new VulkanUInt32(getVk().getDescriptorCount());
    }

    public void setDescriptorCount(VulkanUInt32 descriptorCount) {
        getVk().setDescriptorCount(descriptorCount.getVk());
    }


    public static class Array extends VulkanDescriptorPoolSize implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolSize> {
        public Array(VkDescriptorPoolSize.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPoolSize.Array(count));
        }

        public Array(int count, VulkanDescriptorPoolSize o){
            this(new VkDescriptorPoolSize.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPoolSize.Array getVk(){
            return (VkDescriptorPoolSize.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPoolSize get(int i){
            return new VulkanDescriptorPoolSize(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPoolSize.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPoolSize.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPoolSize.Pointer(value));
        }

        @Override
        public VkDescriptorPoolSize.Pointer getVk(){
            return (VkDescriptorPoolSize.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPoolSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolSize.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPoolSize.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPoolSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPoolSize.Pointer.Array getVk(){
                return (VkDescriptorPoolSize.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPoolSize.Pointer get(int i){
                return new VulkanDescriptorPoolSize.Pointer(getVk().get(i));
            }
        }
    }
}
