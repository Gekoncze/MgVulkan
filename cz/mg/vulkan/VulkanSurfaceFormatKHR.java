package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceFormatKHR extends VulkanObject {
    public VulkanSurfaceFormatKHR(){
        super(new VkSurfaceFormatKHR());
    }

    public VulkanSurfaceFormatKHR(VkSurfaceFormatKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceFormatKHR getVk(){
        return (VkSurfaceFormatKHR) super.getVk();
    }

    public VulkanSurfaceFormatKHR(VulkanFormat format, VulkanColorSpaceKHR colorSpace) {
        super(new VkSurfaceFormatKHR(format.getVk(), colorSpace.getVk()));
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanColorSpaceKHR getColorSpace() {
        return new VulkanColorSpaceKHR(getVk().getColorSpace());
    }

    public void setColorSpace(VulkanColorSpaceKHR colorSpace) {
        getVk().setColorSpace(colorSpace.getVk());
    }


    public static class Array extends VulkanSurfaceFormatKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceFormatKHR> {
        public Array(VkSurfaceFormatKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceFormatKHR.Array(count));
        }

        public Array(int count, VulkanSurfaceFormatKHR o){
            this(new VkSurfaceFormatKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceFormatKHR.Array getVk(){
            return (VkSurfaceFormatKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceFormatKHR get(int i){
            return new VulkanSurfaceFormatKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceFormatKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceFormatKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceFormatKHR.Pointer(value));
        }

        @Override
        public VkSurfaceFormatKHR.Pointer getVk(){
            return (VkSurfaceFormatKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceFormatKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceFormatKHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceFormatKHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceFormatKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceFormatKHR.Pointer.Array getVk(){
                return (VkSurfaceFormatKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceFormatKHR.Pointer get(int i){
                return new VulkanSurfaceFormatKHR.Pointer(getVk().get(i));
            }
        }
    }
}
