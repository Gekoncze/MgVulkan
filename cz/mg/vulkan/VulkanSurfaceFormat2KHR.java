package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceFormat2KHR extends VulkanObject {
    public VulkanSurfaceFormat2KHR(){
        super(new VkSurfaceFormat2KHR());
    }

    public VulkanSurfaceFormat2KHR(VkSurfaceFormat2KHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceFormat2KHR getVk(){
        return (VkSurfaceFormat2KHR) super.getVk();
    }

    public VulkanSurfaceFormat2KHR(VulkanStructureType sType, VulkanObject pNext, VulkanSurfaceFormatKHR surfaceFormat) {
        super(new VkSurfaceFormat2KHR(sType.getVk(), pNext.getVk(), surfaceFormat.getVk()));
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

    public VulkanSurfaceFormatKHR getSurfaceFormat() {
        return new VulkanSurfaceFormatKHR(getVk().getSurfaceFormat());
    }

    public void setSurfaceFormat(VulkanSurfaceFormatKHR surfaceFormat) {
        getVk().setSurfaceFormat(surfaceFormat.getVk());
    }


    public static class Array extends VulkanSurfaceFormat2KHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceFormat2KHR> {
        public Array(VkSurfaceFormat2KHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceFormat2KHR.Array(count));
        }

        public Array(int count, VulkanSurfaceFormat2KHR o){
            this(new VkSurfaceFormat2KHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceFormat2KHR.Array getVk(){
            return (VkSurfaceFormat2KHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceFormat2KHR get(int i){
            return new VulkanSurfaceFormat2KHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceFormat2KHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceFormat2KHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceFormat2KHR.Pointer(value));
        }

        @Override
        public VkSurfaceFormat2KHR.Pointer getVk(){
            return (VkSurfaceFormat2KHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceFormat2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceFormat2KHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceFormat2KHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceFormat2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceFormat2KHR.Pointer.Array getVk(){
                return (VkSurfaceFormat2KHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceFormat2KHR.Pointer get(int i){
                return new VulkanSurfaceFormat2KHR.Pointer(getVk().get(i));
            }
        }
    }
}
