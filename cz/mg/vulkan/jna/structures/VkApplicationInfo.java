package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.types.uint32_t;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkApplicationInfo {
 *      VkStructureType    sType;
 *      const void*        pNext;
 *      const char*        pApplicationName;
 *      uint32_t           applicationVersion;
 *      const char*        pEngineName;
 *      uint32_t           engineVersion;
 *      uint32_t           apiVersion;
 *  } VkApplicationInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkApplicationInfo.html">khronos documentation</a>
 **/
public class VkApplicationInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public String pApplicationName;
    public uint32_t applicationVersion;
    public String pEngineName;
    public uint32_t engineVersion;
    public uint32_t apiVersion;

    public VkApplicationInfo() {
    }

    public VkApplicationInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "pApplicationName",
                "applicationVersion",
                "pEngineName",
                "engineVersion",
                "apiVersion"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkApplicationInfo implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkApplicationInfo implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
