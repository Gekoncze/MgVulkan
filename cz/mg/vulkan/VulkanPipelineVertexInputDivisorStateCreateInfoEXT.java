package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineVertexInputDivisorStateCreateInfoEXT extends VulkanObject {
    public VulkanPipelineVertexInputDivisorStateCreateInfoEXT(){
        super(new VkPipelineVertexInputDivisorStateCreateInfoEXT());
    }

    public VulkanPipelineVertexInputDivisorStateCreateInfoEXT(VkPipelineVertexInputDivisorStateCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT getVk(){
        return (VkPipelineVertexInputDivisorStateCreateInfoEXT) super.getVk();
    }
    public VulkanPipelineVertexInputDivisorStateCreateInfoEXT(VulkanObject pNext, VulkanUInt32 vertexBindingDivisorCount, VulkanVertexInputBindingDivisorDescriptionEXT pVertexBindingDivisors) {
        super(new VkPipelineVertexInputDivisorStateCreateInfoEXT(pNext.getVk(), vertexBindingDivisorCount.getVk(), pVertexBindingDivisors.getVk()));
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

    public VulkanUInt32 getVertexBindingDivisorCount() {
        return new VulkanUInt32(getVk().getVertexBindingDivisorCount());
    }

    public void setVertexBindingDivisorCount(VulkanUInt32 vertexBindingDivisorCount) {
        getVk().setVertexBindingDivisorCount(vertexBindingDivisorCount.getVk());
    }

    public VulkanVertexInputBindingDivisorDescriptionEXT getPVertexBindingDivisors() {
        return new VulkanVertexInputBindingDivisorDescriptionEXT(getVk().getPVertexBindingDivisors());
    }

    public void setPVertexBindingDivisors(VulkanVertexInputBindingDivisorDescriptionEXT pVertexBindingDivisors) {
        getVk().setPVertexBindingDivisors(pVertexBindingDivisors.getVk());
    }


    public static class Array extends VulkanPipelineVertexInputDivisorStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputDivisorStateCreateInfoEXT> {
        public Array(VkPipelineVertexInputDivisorStateCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineVertexInputDivisorStateCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanPipelineVertexInputDivisorStateCreateInfoEXT o){
            this(new VkPipelineVertexInputDivisorStateCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Array getVk(){
            return (VkPipelineVertexInputDivisorStateCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineVertexInputDivisorStateCreateInfoEXT get(int i){
            return new VulkanPipelineVertexInputDivisorStateCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer getVk(){
            return (VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineVertexInputDivisorStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputDivisorStateCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineVertexInputDivisorStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer.Array getVk(){
                return (VkPipelineVertexInputDivisorStateCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineVertexInputDivisorStateCreateInfoEXT.Pointer get(int i){
                return new VulkanPipelineVertexInputDivisorStateCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
