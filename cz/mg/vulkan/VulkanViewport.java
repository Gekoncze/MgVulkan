package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkViewport.html">khronos documentation</a>
 **/
public class VulkanViewport extends VulkanObject {
    public VulkanViewport(){
        super(new VkViewport());
    }

    public VulkanViewport(VkViewport vk){
        super(vk);
    }

    @Override
    public VkViewport getVk(){
        return (VkViewport) super.getVk();
    }

    public VulkanViewport(VulkanFloat x, VulkanFloat y, VulkanFloat width, VulkanFloat height, VulkanFloat minDepth, VulkanFloat maxDepth) {
        super(new VkViewport(x.getVk(), y.getVk(), width.getVk(), height.getVk(), minDepth.getVk(), maxDepth.getVk()));
    }

    public VulkanFloat getX() {
        return new VulkanFloat(getVk().getX());
    }

    public void setX(VulkanFloat x) {
        getVk().setX(x.getVk());
    }

    public VulkanFloat getY() {
        return new VulkanFloat(getVk().getY());
    }

    public void setY(VulkanFloat y) {
        getVk().setY(y.getVk());
    }

    public VulkanFloat getWidth() {
        return new VulkanFloat(getVk().getWidth());
    }

    public void setWidth(VulkanFloat width) {
        getVk().setWidth(width.getVk());
    }

    public VulkanFloat getHeight() {
        return new VulkanFloat(getVk().getHeight());
    }

    public void setHeight(VulkanFloat height) {
        getVk().setHeight(height.getVk());
    }

    public VulkanFloat getMinDepth() {
        return new VulkanFloat(getVk().getMinDepth());
    }

    public void setMinDepth(VulkanFloat minDepth) {
        getVk().setMinDepth(minDepth.getVk());
    }

    public VulkanFloat getMaxDepth() {
        return new VulkanFloat(getVk().getMaxDepth());
    }

    public void setMaxDepth(VulkanFloat maxDepth) {
        getVk().setMaxDepth(maxDepth.getVk());
    }


    public static class Array extends VulkanViewport implements cz.mg.collections.array.ReadonlyArray<VulkanViewport> {
        public Array(VkViewport.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkViewport.Array(count));
        }

        public Array(int count, VulkanViewport o){
            this(new VkViewport.Array(count, o.getVk()));
        }

        @Override
        public VkViewport.Array getVk(){
            return (VkViewport.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanViewport get(int i){
            return new VulkanViewport(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkViewport.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkViewport.Pointer());
        }

        public Pointer(long value) {
            this(new VkViewport.Pointer(value));
        }

        @Override
        public VkViewport.Pointer getVk(){
            return (VkViewport.Pointer) super.getVk();
        }

        public static class Array extends VulkanViewport.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanViewport.Pointer> {
            public Array(int count) {
                super(new VkViewport.Pointer.Array(count));
            }

            public Array(VulkanViewport[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkViewport.Pointer.Array getVk(){
                return (VkViewport.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanViewport.Pointer get(int i){
                return new VulkanViewport.Pointer(getVk().get(i));
            }
        }
    }
}
