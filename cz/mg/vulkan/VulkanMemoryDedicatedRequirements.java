package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryDedicatedRequirements extends VulkanObject {
    public VulkanMemoryDedicatedRequirements(){
        super(new VkMemoryDedicatedRequirements());
    }

    public VulkanMemoryDedicatedRequirements(VkMemoryDedicatedRequirements vk){
        super(vk);
    }

    @Override
    public VkMemoryDedicatedRequirements getVk(){
        return (VkMemoryDedicatedRequirements) super.getVk();
    }

    public VulkanMemoryDedicatedRequirements(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 prefersDedicatedAllocation, VulkanBool32 requiresDedicatedAllocation) {
        super(new VkMemoryDedicatedRequirements(sType.getVk(), pNext.getVk(), prefersDedicatedAllocation.getVk(), requiresDedicatedAllocation.getVk()));
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

    public VulkanBool32 getPrefersDedicatedAllocation() {
        return new VulkanBool32(getVk().getPrefersDedicatedAllocation());
    }

    public void setPrefersDedicatedAllocation(VulkanBool32 prefersDedicatedAllocation) {
        getVk().setPrefersDedicatedAllocation(prefersDedicatedAllocation.getVk());
    }

    public VulkanBool32 getRequiresDedicatedAllocation() {
        return new VulkanBool32(getVk().getRequiresDedicatedAllocation());
    }

    public void setRequiresDedicatedAllocation(VulkanBool32 requiresDedicatedAllocation) {
        getVk().setRequiresDedicatedAllocation(requiresDedicatedAllocation.getVk());
    }


    public static class Array extends VulkanMemoryDedicatedRequirements implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryDedicatedRequirements> {
        public Array(VkMemoryDedicatedRequirements.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryDedicatedRequirements.Array(count));
        }

        public Array(int count, VulkanMemoryDedicatedRequirements o){
            this(new VkMemoryDedicatedRequirements.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryDedicatedRequirements.Array getVk(){
            return (VkMemoryDedicatedRequirements.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryDedicatedRequirements get(int i){
            return new VulkanMemoryDedicatedRequirements(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryDedicatedRequirements.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryDedicatedRequirements.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryDedicatedRequirements.Pointer(value));
        }

        @Override
        public VkMemoryDedicatedRequirements.Pointer getVk(){
            return (VkMemoryDedicatedRequirements.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryDedicatedRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryDedicatedRequirements.Pointer> {
            public Array(int count) {
                super(new VkMemoryDedicatedRequirements.Pointer.Array(count));
            }

            public Array(VulkanMemoryDedicatedRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryDedicatedRequirements.Pointer.Array getVk(){
                return (VkMemoryDedicatedRequirements.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryDedicatedRequirements.Pointer get(int i){
                return new VulkanMemoryDedicatedRequirements.Pointer(getVk().get(i));
            }
        }
    }
}
