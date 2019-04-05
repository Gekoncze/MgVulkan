package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanAllocationCallbacks extends VulkanObject {
    public VulkanAllocationCallbacks(){
        super(new VkAllocationCallbacks());
    }

    public VulkanAllocationCallbacks(VkAllocationCallbacks vk){
        super(vk);
    }

    @Override
    public VkAllocationCallbacks getVk(){
        return (VkAllocationCallbacks) super.getVk();
    }

    public VulkanAllocationCallbacks(VulkanObject pUserData, PFNAllocationFunction pfnAllocation, PFNReallocationFunction pfnReallocation, PFNFreeFunction pfnFree, PFNInternalAllocationNotification pfnInternalAllocation, PFNInternalFreeNotification pfnInternalFree) {
        super(new VkAllocationCallbacks(pUserData.getVk(), pfnAllocation.getVk(), pfnReallocation.getVk(), pfnFree.getVk(), pfnInternalAllocation.getVk(), pfnInternalFree.getVk()));
    }

    public VulkanObject getPUserData() {
        return new VulkanObject(getVk().getPUserData());
    }

    public void setPUserData(VulkanObject pUserData) {
        getVk().setPUserData(pUserData.getVk());
    }

    public PFNAllocationFunction getPfnAllocation() {
        return new PFNAllocationFunction(getVk().getPfnAllocation());
    }

    public void setPfnAllocation(PFNAllocationFunction pfnAllocation) {
        getVk().setPfnAllocation(pfnAllocation.getVk());
    }

    public PFNReallocationFunction getPfnReallocation() {
        return new PFNReallocationFunction(getVk().getPfnReallocation());
    }

    public void setPfnReallocation(PFNReallocationFunction pfnReallocation) {
        getVk().setPfnReallocation(pfnReallocation.getVk());
    }

    public PFNFreeFunction getPfnFree() {
        return new PFNFreeFunction(getVk().getPfnFree());
    }

    public void setPfnFree(PFNFreeFunction pfnFree) {
        getVk().setPfnFree(pfnFree.getVk());
    }

    public PFNInternalAllocationNotification getPfnInternalAllocation() {
        return new PFNInternalAllocationNotification(getVk().getPfnInternalAllocation());
    }

    public void setPfnInternalAllocation(PFNInternalAllocationNotification pfnInternalAllocation) {
        getVk().setPfnInternalAllocation(pfnInternalAllocation.getVk());
    }

    public PFNInternalFreeNotification getPfnInternalFree() {
        return new PFNInternalFreeNotification(getVk().getPfnInternalFree());
    }

    public void setPfnInternalFree(PFNInternalFreeNotification pfnInternalFree) {
        getVk().setPfnInternalFree(pfnInternalFree.getVk());
    }


    public static class Array extends VulkanAllocationCallbacks implements cz.mg.collections.array.ReadonlyArray<VulkanAllocationCallbacks> {
        public Array(VkAllocationCallbacks.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAllocationCallbacks.Array(count));
        }

        public Array(int count, VulkanAllocationCallbacks o){
            this(new VkAllocationCallbacks.Array(count, o.getVk()));
        }

        @Override
        public VkAllocationCallbacks.Array getVk(){
            return (VkAllocationCallbacks.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAllocationCallbacks get(int i){
            return new VulkanAllocationCallbacks(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAllocationCallbacks.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAllocationCallbacks.Pointer());
        }

        public Pointer(long value) {
            this(new VkAllocationCallbacks.Pointer(value));
        }

        @Override
        public VkAllocationCallbacks.Pointer getVk(){
            return (VkAllocationCallbacks.Pointer) super.getVk();
        }

        public static class Array extends VulkanAllocationCallbacks.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAllocationCallbacks.Pointer> {
            public Array(int count) {
                super(new VkAllocationCallbacks.Pointer.Array(count));
            }

            public Array(VulkanAllocationCallbacks[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAllocationCallbacks.Pointer.Array getVk(){
                return (VkAllocationCallbacks.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAllocationCallbacks.Pointer get(int i){
                return new VulkanAllocationCallbacks.Pointer(getVk().get(i));
            }
        }
    }
}
