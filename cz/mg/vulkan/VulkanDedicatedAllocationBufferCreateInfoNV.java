package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDedicatedAllocationBufferCreateInfoNV.html">khronos documentation</a>
 **/
public class VulkanDedicatedAllocationBufferCreateInfoNV extends VulkanObject {
    public VulkanDedicatedAllocationBufferCreateInfoNV(){
        super(new VkDedicatedAllocationBufferCreateInfoNV());
    }

    public VulkanDedicatedAllocationBufferCreateInfoNV(VkDedicatedAllocationBufferCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkDedicatedAllocationBufferCreateInfoNV getVk(){
        return (VkDedicatedAllocationBufferCreateInfoNV) super.getVk();
    }
    public VulkanDedicatedAllocationBufferCreateInfoNV(VulkanObject pNext, VulkanBool32 dedicatedAllocation) {
        super(new VkDedicatedAllocationBufferCreateInfoNV(pNext.getVk(), dedicatedAllocation.getVk()));
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


    public static class Array extends VulkanDedicatedAllocationBufferCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationBufferCreateInfoNV> {
        public Array(VkDedicatedAllocationBufferCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDedicatedAllocationBufferCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanDedicatedAllocationBufferCreateInfoNV o){
            this(new VkDedicatedAllocationBufferCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkDedicatedAllocationBufferCreateInfoNV.Array getVk(){
            return (VkDedicatedAllocationBufferCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDedicatedAllocationBufferCreateInfoNV get(int i){
            return new VulkanDedicatedAllocationBufferCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDedicatedAllocationBufferCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDedicatedAllocationBufferCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkDedicatedAllocationBufferCreateInfoNV.Pointer(value));
        }

        @Override
        public VkDedicatedAllocationBufferCreateInfoNV.Pointer getVk(){
            return (VkDedicatedAllocationBufferCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanDedicatedAllocationBufferCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDedicatedAllocationBufferCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkDedicatedAllocationBufferCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanDedicatedAllocationBufferCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDedicatedAllocationBufferCreateInfoNV.Pointer.Array getVk(){
                return (VkDedicatedAllocationBufferCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDedicatedAllocationBufferCreateInfoNV.Pointer get(int i){
                return new VulkanDedicatedAllocationBufferCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
