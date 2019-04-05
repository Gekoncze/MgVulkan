package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSwapchainCounterCreateInfoEXT extends VulkanObject {
    public VulkanSwapchainCounterCreateInfoEXT(){
        super(new VkSwapchainCounterCreateInfoEXT());
    }

    public VulkanSwapchainCounterCreateInfoEXT(VkSwapchainCounterCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkSwapchainCounterCreateInfoEXT getVk(){
        return (VkSwapchainCounterCreateInfoEXT) super.getVk();
    }
    public VulkanSwapchainCounterCreateInfoEXT(VulkanObject pNext, VulkanSurfaceCounterFlagsEXT surfaceCounters) {
        super(new VkSwapchainCounterCreateInfoEXT(pNext.getVk(), surfaceCounters.getVk()));
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

    public VulkanSurfaceCounterFlagsEXT getSurfaceCounters() {
        return new VulkanSurfaceCounterFlagsEXT(getVk().getSurfaceCounters());
    }

    public void setSurfaceCounters(VulkanSurfaceCounterFlagsEXT surfaceCounters) {
        getVk().setSurfaceCounters(surfaceCounters.getVk());
    }


    public static class Array extends VulkanSwapchainCounterCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCounterCreateInfoEXT> {
        public Array(VkSwapchainCounterCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSwapchainCounterCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanSwapchainCounterCreateInfoEXT o){
            this(new VkSwapchainCounterCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainCounterCreateInfoEXT.Array getVk(){
            return (VkSwapchainCounterCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainCounterCreateInfoEXT get(int i){
            return new VulkanSwapchainCounterCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSwapchainCounterCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSwapchainCounterCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSwapchainCounterCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkSwapchainCounterCreateInfoEXT.Pointer getVk(){
            return (VkSwapchainCounterCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSwapchainCounterCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCounterCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkSwapchainCounterCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanSwapchainCounterCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSwapchainCounterCreateInfoEXT.Pointer.Array getVk(){
                return (VkSwapchainCounterCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSwapchainCounterCreateInfoEXT.Pointer get(int i){
                return new VulkanSwapchainCounterCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
