package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPolygonMode.html">khronos documentation</a>
 **/
public class VulkanPolygonMode extends VulkanEnum {
    public static final int FILL = VkPolygonMode.VK_POLYGON_MODE_FILL;
    public static final int LINE = VkPolygonMode.VK_POLYGON_MODE_LINE;
    public static final int POINT = VkPolygonMode.VK_POLYGON_MODE_POINT;
    public static final int FILL_RECTANGLE_NV = VkPolygonMode.VK_POLYGON_MODE_FILL_RECTANGLE_NV;

    public VulkanPolygonMode(){
        super(new VkPolygonMode());
    }

    public VulkanPolygonMode(VkPolygonMode vk){
        super(vk);
    }

    @Override
    public VkPolygonMode getVk(){
        return (VkPolygonMode) super.getVk();
    }

    public VulkanPolygonMode(int value){
        super(new VkPolygonMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == FILL) return "FILL";
        if(getValue() == LINE) return "LINE";
        if(getValue() == POINT) return "POINT";
        if(getValue() == FILL_RECTANGLE_NV) return "FILL_RECTANGLE_NV";
        return "UNKNOWN";
    }

    public static class Array extends VulkanPolygonMode implements cz.mg.collections.array.ReadonlyArray<VulkanPolygonMode> {
        public Array(VkPolygonMode.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPolygonMode.Array(count));
        }

        public Array(int count, VulkanPolygonMode o){
            this(new VkPolygonMode.Array(count, o.getVk()));
        }

        @Override
        public VkPolygonMode.Array getVk(){
            return (VkPolygonMode.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPolygonMode get(int i){
            return new VulkanPolygonMode(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPolygonMode.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPolygonMode.Pointer());
        }

        public Pointer(long value) {
            this(new VkPolygonMode.Pointer(value));
        }

        @Override
        public VkPolygonMode.Pointer getVk(){
            return (VkPolygonMode.Pointer) super.getVk();
        }

        public static class Array extends VulkanPolygonMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPolygonMode.Pointer> {
            public Array(int count) {
                super(new VkPolygonMode.Pointer.Array(count));
            }

            public Array(VulkanPolygonMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPolygonMode.Pointer.Array getVk(){
                return (VkPolygonMode.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPolygonMode.Pointer get(int i){
                return new VulkanPolygonMode.Pointer(getVk().get(i));
            }
        }
    }
}
