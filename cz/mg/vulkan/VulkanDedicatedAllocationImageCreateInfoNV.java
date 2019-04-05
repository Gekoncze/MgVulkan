package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDedicatedAllocationImageCreateInfoNV extends VulkanObject {
    public VulkanDedicatedAllocationImageCreateInfoNV(){
        super(new VkDedicatedAllocationImageCreateInfoNV());
    }

    public VulkanDedicatedAllocationImageCreateInfoNV(VkDedicatedAllocationImageCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkDedicatedAllocationImageCreateInfoNV getVk(){
        return (VkDedicatedAllocationImageCreateInfoNV) super.getVk();
    }
    public VulkanDedicatedAllocationImageCreateInfoNV(VulkanObject pNext, VulkanBool32 dedicatedAllocation) {
        super(new VkDedicatedAllocationImageCreateInfoNV(pNext.getVk(), dedicatedAllocation.getVk()));
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

    public VulkanBool32 getDedicatedAllocation() {
        return new VulkanBool32(getVk().getDedicatedAllocation());
    }

    public void setDedicatedAllocation(VulkanBool32 dedicatedAllocation) {
        getVk().setDedicatedAllocation(dedicatedAllocation.getVk());
    }


    public static class Array extends VulkanDedicatedAllocationImageCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationImageCreateInfoNV> {
        public Array(VkDedicatedAllocationImageCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDedicatedAllocationImageCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanDedicatedAllocationImageCreateInfoNV o){
            this(new VkDedicatedAllocationImageCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkDedicatedAllocationImageCreateInfoNV.Array getVk(){
            return (VkDedicatedAllocationImageCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDedicatedAllocationImageCreateInfoNV get(int i){
            return new VulkanDedicatedAllocationImageCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDedicatedAllocationImageCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDedicatedAllocationImageCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkDedicatedAllocationImageCreateInfoNV.Pointer(value));
        }

        @Override
        public VkDedicatedAllocationImageCreateInfoNV.Pointer getVk(){
            return (VkDedicatedAllocationImageCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanDedicatedAllocationImageCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationImageCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkDedicatedAllocationImageCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanDedicatedAllocationImageCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDedicatedAllocationImageCreateInfoNV.Pointer.Array getVk(){
                return (VkDedicatedAllocationImageCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDedicatedAllocationImageCreateInfoNV.Pointer get(int i){
                return new VulkanDedicatedAllocationImageCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
