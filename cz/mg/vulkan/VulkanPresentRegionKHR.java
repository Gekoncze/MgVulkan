package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPresentRegionKHR.html">khronos documentation</a>
 **/
public class VulkanPresentRegionKHR extends VulkanObject {
    public VulkanPresentRegionKHR(){
        super(new VkPresentRegionKHR());
    }

    public VulkanPresentRegionKHR(VkPresentRegionKHR vk){
        super(vk);
    }

    @Override
    public VkPresentRegionKHR getVk(){
        return (VkPresentRegionKHR) super.getVk();
    }

    public VulkanPresentRegionKHR(VulkanUInt32 rectangleCount, VulkanRectLayerKHR pRectangles) {
        super(new VkPresentRegionKHR(rectangleCount.getVk(), pRectangles.getVk()));
    }

    public VulkanUInt32 getRectangleCount() {
        return new VulkanUInt32(getVk().getRectangleCount());
    }

    public void setRectangleCount(VulkanUInt32 rectangleCount) {
        getVk().setRectangleCount(rectangleCount.getVk());
    }

    public VulkanRectLayerKHR getPRectangles() {
        return new VulkanRectLayerKHR(getVk().getPRectangles());
    }

    public void setPRectangles(VulkanRectLayerKHR pRectangles) {
        getVk().setPRectangles(pRectangles.getVk());
    }


    public static class Array extends VulkanPresentRegionKHR implements cz.mg.collections.array.ReadonlyArray<VulkanPresentRegionKHR> {
        public Array(VkPresentRegionKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentRegionKHR.Array(count));
        }

        public Array(int count, VulkanPresentRegionKHR o){
            this(new VkPresentRegionKHR.Array(count, o.getVk()));
        }

        @Override
        public VkPresentRegionKHR.Array getVk(){
            return (VkPresentRegionKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentRegionKHR get(int i){
            return new VulkanPresentRegionKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentRegionKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentRegionKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentRegionKHR.Pointer(value));
        }

        @Override
        public VkPresentRegionKHR.Pointer getVk(){
            return (VkPresentRegionKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentRegionKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentRegionKHR.Pointer> {
            public Array(int count) {
                super(new VkPresentRegionKHR.Pointer.Array(count));
            }

            public Array(VulkanPresentRegionKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentRegionKHR.Pointer.Array getVk(){
                return (VkPresentRegionKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentRegionKHR.Pointer get(int i){
                return new VulkanPresentRegionKHR.Pointer(getVk().get(i));
            }
        }
    }
}
