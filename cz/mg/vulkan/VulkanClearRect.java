package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanClearRect extends VulkanObject {
    public VulkanClearRect(){
        super(new VkClearRect());
    }

    public VulkanClearRect(VkClearRect vk){
        super(vk);
    }

    @Override
    public VkClearRect getVk(){
        return (VkClearRect) super.getVk();
    }

    public VulkanClearRect(VulkanRect2D rect, VulkanUInt32 baseArrayLayer, VulkanUInt32 layerCount) {
        super(new VkClearRect(rect.getVk(), baseArrayLayer.getVk(), layerCount.getVk()));
    }

    public VulkanRect2D getRect() {
        return new VulkanRect2D(getVk().getRect());
    }

    public void setRect(VulkanRect2D rect) {
        getVk().setRect(rect.getVk());
    }

    public VulkanUInt32 getBaseArrayLayer() {
        return new VulkanUInt32(getVk().getBaseArrayLayer());
    }

    public void setBaseArrayLayer(VulkanUInt32 baseArrayLayer) {
        getVk().setBaseArrayLayer(baseArrayLayer.getVk());
    }

    public VulkanUInt32 getLayerCount() {
        return new VulkanUInt32(getVk().getLayerCount());
    }

    public void setLayerCount(VulkanUInt32 layerCount) {
        getVk().setLayerCount(layerCount.getVk());
    }


    public static class Array extends VulkanClearRect implements cz.mg.collections.array.ReadonlyArray<VulkanClearRect> {
        public Array(VkClearRect.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkClearRect.Array(count));
        }

        public Array(int count, VulkanClearRect o){
            this(new VkClearRect.Array(count, o.getVk()));
        }

        @Override
        public VkClearRect.Array getVk(){
            return (VkClearRect.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanClearRect get(int i){
            return new VulkanClearRect(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkClearRect.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkClearRect.Pointer());
        }

        public Pointer(long value) {
            this(new VkClearRect.Pointer(value));
        }

        @Override
        public VkClearRect.Pointer getVk(){
            return (VkClearRect.Pointer) super.getVk();
        }

        public static class Array extends VulkanClearRect.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanClearRect.Pointer> {
            public Array(int count) {
                super(new VkClearRect.Pointer.Array(count));
            }

            public Array(VulkanClearRect[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkClearRect.Pointer.Array getVk(){
                return (VkClearRect.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanClearRect.Pointer get(int i){
                return new VulkanClearRect.Pointer(getVk().get(i));
            }
        }
    }
}
