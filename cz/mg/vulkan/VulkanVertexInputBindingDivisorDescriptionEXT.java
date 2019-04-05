package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanVertexInputBindingDivisorDescriptionEXT extends VulkanObject {
    public VulkanVertexInputBindingDivisorDescriptionEXT(){
        super(new VkVertexInputBindingDivisorDescriptionEXT());
    }

    public VulkanVertexInputBindingDivisorDescriptionEXT(VkVertexInputBindingDivisorDescriptionEXT vk){
        super(vk);
    }

    @Override
    public VkVertexInputBindingDivisorDescriptionEXT getVk(){
        return (VkVertexInputBindingDivisorDescriptionEXT) super.getVk();
    }

    public VulkanVertexInputBindingDivisorDescriptionEXT(VulkanUInt32 binding, VulkanUInt32 divisor) {
        super(new VkVertexInputBindingDivisorDescriptionEXT(binding.getVk(), divisor.getVk()));
    }

    public VulkanUInt32 getBinding() {
        return new VulkanUInt32(getVk().getBinding());
    }

    public void setBinding(VulkanUInt32 binding) {
        getVk().setBinding(binding.getVk());
    }

    public VulkanUInt32 getDivisor() {
        return new VulkanUInt32(getVk().getDivisor());
    }

    public void setDivisor(VulkanUInt32 divisor) {
        getVk().setDivisor(divisor.getVk());
    }


    public static class Array extends VulkanVertexInputBindingDivisorDescriptionEXT implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputBindingDivisorDescriptionEXT> {
        public Array(VkVertexInputBindingDivisorDescriptionEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkVertexInputBindingDivisorDescriptionEXT.Array(count));
        }

        public Array(int count, VulkanVertexInputBindingDivisorDescriptionEXT o){
            this(new VkVertexInputBindingDivisorDescriptionEXT.Array(count, o.getVk()));
        }

        @Override
        public VkVertexInputBindingDivisorDescriptionEXT.Array getVk(){
            return (VkVertexInputBindingDivisorDescriptionEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanVertexInputBindingDivisorDescriptionEXT get(int i){
            return new VulkanVertexInputBindingDivisorDescriptionEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkVertexInputBindingDivisorDescriptionEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkVertexInputBindingDivisorDescriptionEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkVertexInputBindingDivisorDescriptionEXT.Pointer(value));
        }

        @Override
        public VkVertexInputBindingDivisorDescriptionEXT.Pointer getVk(){
            return (VkVertexInputBindingDivisorDescriptionEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanVertexInputBindingDivisorDescriptionEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputBindingDivisorDescriptionEXT.Pointer> {
            public Array(int count) {
                super(new VkVertexInputBindingDivisorDescriptionEXT.Pointer.Array(count));
            }

            public Array(VulkanVertexInputBindingDivisorDescriptionEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkVertexInputBindingDivisorDescriptionEXT.Pointer.Array getVk(){
                return (VkVertexInputBindingDivisorDescriptionEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanVertexInputBindingDivisorDescriptionEXT.Pointer get(int i){
                return new VulkanVertexInputBindingDivisorDescriptionEXT.Pointer(getVk().get(i));
            }
        }
    }
}
