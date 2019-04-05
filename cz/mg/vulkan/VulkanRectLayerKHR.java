package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRectLayerKHR extends VulkanObject {
    public VulkanRectLayerKHR(){
        super(new VkRectLayerKHR());
    }

    public VulkanRectLayerKHR(VkRectLayerKHR vk){
        super(vk);
    }

    @Override
    public VkRectLayerKHR getVk(){
        return (VkRectLayerKHR) super.getVk();
    }

    public VulkanRectLayerKHR(VulkanOffset2D offset, VulkanExtent2D extent, VulkanUInt32 layer) {
        super(new VkRectLayerKHR(offset.getVk(), extent.getVk(), layer.getVk()));
    }

    public VulkanOffset2D getOffset() {
        return new VulkanOffset2D(getVk().getOffset());
    }

    public void setOffset(VulkanOffset2D offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanExtent2D getExtent() {
        return new VulkanExtent2D(getVk().getExtent());
    }

    public void setExtent(VulkanExtent2D extent) {
        getVk().setExtent(extent.getVk());
    }

    public VulkanUInt32 getLayer() {
        return new VulkanUInt32(getVk().getLayer());
    }

    public void setLayer(VulkanUInt32 layer) {
        getVk().setLayer(layer.getVk());
    }


    public static class Array extends VulkanRectLayerKHR implements cz.mg.collections.array.ReadonlyArray<VulkanRectLayerKHR> {
        public Array(VkRectLayerKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRectLayerKHR.Array(count));
        }

        public Array(int count, VulkanRectLayerKHR o){
            this(new VkRectLayerKHR.Array(count, o.getVk()));
        }

        @Override
        public VkRectLayerKHR.Array getVk(){
            return (VkRectLayerKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRectLayerKHR get(int i){
            return new VulkanRectLayerKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRectLayerKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRectLayerKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkRectLayerKHR.Pointer(value));
        }

        @Override
        public VkRectLayerKHR.Pointer getVk(){
            return (VkRectLayerKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanRectLayerKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRectLayerKHR.Pointer> {
            public Array(int count) {
                super(new VkRectLayerKHR.Pointer.Array(count));
            }

            public Array(VulkanRectLayerKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRectLayerKHR.Pointer.Array getVk(){
                return (VkRectLayerKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRectLayerKHR.Pointer get(int i){
                return new VulkanRectLayerKHR.Pointer(getVk().get(i));
            }
        }
    }
}
