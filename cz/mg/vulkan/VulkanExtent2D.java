package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtent2D.html">khronos documentation</a>
 **/
public class VulkanExtent2D extends VulkanObject {
    public VulkanExtent2D(){
        super(new VkExtent2D());
    }

    public VulkanExtent2D(VkExtent2D vk){
        super(vk);
    }

    @Override
    public VkExtent2D getVk(){
        return (VkExtent2D) super.getVk();
    }

    public VulkanExtent2D(VulkanUInt32 width, VulkanUInt32 height) {
        super(new VkExtent2D(width.getVk(), height.getVk()));
    }

    public VulkanUInt32 getWidth() {
        return new VulkanUInt32(getVk().getWidth());
    }

    public void setWidth(VulkanUInt32 width) {
        getVk().setWidth(width.getVk());
    }

    public VulkanUInt32 getHeight() {
        return new VulkanUInt32(getVk().getHeight());
    }

    public void setHeight(VulkanUInt32 height) {
        getVk().setHeight(height.getVk());
    }


    public static class Array extends VulkanExtent2D implements cz.mg.collections.array.ReadonlyArray<VulkanExtent2D> {
        public Array(VkExtent2D.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExtent2D.Array(count));
        }

        public Array(int count, VulkanExtent2D o){
            this(new VkExtent2D.Array(count, o.getVk()));
        }

        @Override
        public VkExtent2D.Array getVk(){
            return (VkExtent2D.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExtent2D get(int i){
            return new VulkanExtent2D(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExtent2D.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExtent2D.Pointer());
        }

        public Pointer(long value) {
            this(new VkExtent2D.Pointer(value));
        }

        @Override
        public VkExtent2D.Pointer getVk(){
            return (VkExtent2D.Pointer) super.getVk();
        }

        public static class Array extends VulkanExtent2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExtent2D.Pointer> {
            public Array(int count) {
                super(new VkExtent2D.Pointer.Array(count));
            }

            public Array(VulkanExtent2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExtent2D.Pointer.Array getVk(){
                return (VkExtent2D.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExtent2D.Pointer get(int i){
                return new VulkanExtent2D.Pointer(getVk().get(i));
            }
        }
    }
}
